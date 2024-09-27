import java.util.Stack;
class PostfixEvaluator {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (isOperator(token.charAt(0))) {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(token.charAt(0), operand1, operand2);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    public static int performOperation(char operator, int operand1, int operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            default:
                throw new UnsupportedOperationException("Invalid operator: " + operator);
        }
    }
    public static void main(String[] args) {
        String expression1 = "5 6 2 + *";
        String expression2 = "10 2 8 * + 3 -";
        System.out.println("Result of expression 1: " + evaluatePostfix(expression1)); // Output: 40
        System.out.println("Result of expression 2: " + evaluatePostfix(expression2)); // Output: 19
    }
}
