import java.util.Stack;
class BalancedParenthesisChecker {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
    public static void main(String[] args) {
        String expression1 = "{(a+b)*(c-d)}";
        String expression2 = "{(a+b)*[c-d)}";
        System.out.println(expression1 + " is balanced: " + isBalanced(expression1));
        System.out.println(expression2 + " is balanced: " + isBalanced(expression2));
    }
}
