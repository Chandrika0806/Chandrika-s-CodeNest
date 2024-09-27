import java.util.Stack;
class InfixToPostfixConverter {
    public static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3; 
            default:
                return 0;
        }
    }
    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }
    public static String infixToPostfix(String expression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        for (char ch : expression.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop();
            }
            else if (isOperator(ch)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }
    public static void main(String[] args) {
        String infixExpression1 = "A+B*(C^D-E)";
        String infixExpression2 = "(A+B)*C-D";
        System.out.println("Postfix of '" + infixExpression1 + "' is: " + infixToPostfix(infixExpression1));
        System.out.println("Postfix of '" + infixExpression2 + "' is: " + infixToPostfix(infixExpression2));
    }
}
