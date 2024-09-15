import java.util.Scanner;

public class StringCombiner {
    public static String combineStrings(String a, String b) {
        String shortStr = a.length() < b.length() ? a : b;
        String longStr = a.length() >= b.length() ? a : b;
        return shortStr + longStr + shortStr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String a = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String b = scanner.nextLine();
        String result = combineStrings(a, b);
        System.out.println("Combined string: " + result);
        scanner.close();
    }
}
