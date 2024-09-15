import java.util.Scanner;
public class AddLastDigits {
    public static int addLastDigits(int input1, int input2) {
        input1 = Math.abs(input1);
        input2 = Math.abs(input2);
        int lastDigit1 = input1 % 10;
        int lastDigit2 = input2 % 10;
        return lastDigit1 + lastDigit2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();      
        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        int result = addLastDigits(number1, number2);
        System.out.println("The sum of the last digits is: " + result);
    }
}
