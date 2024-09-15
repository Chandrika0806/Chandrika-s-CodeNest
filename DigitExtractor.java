import java.util.Scanner;
public class DigitExtractor { 
    public static int getSecondLastDigit(int n) {
        n = Math.abs(n);
		if (n < 10) {
			return -1;
    }
	int SecondLatDigit = (n/10) % 10;
	return SecondLatDigit;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        try {
            int result = getSecondLastDigit(n);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
