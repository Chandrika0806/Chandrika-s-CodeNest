public class MultipleChecker {
    public static int checkMultiple(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 3;
        }
        if (num1 % num2 == 0) {
            return 2; 
        } else {
            return 1; 
        }
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int result = checkMultiple(num1, num2);
        System.out.println("Input: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("Output: " + result); 
        num1 = -10;
        result = checkMultiple(num1, num2);
        System.out.println("Input: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("Output: " + result); 

        num1 = 0;
        result = checkMultiple(num1, num2);
        System.out.println("Input: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("Output: " + result); 

        num1 = 10;
        num2 = 3;
        result = checkMultiple(num1, num2);
        System.out.println("Input: num1 = " + num1 + ", num2 = " + num2);
        System.out.println("Output: " + result); 
    }
}
