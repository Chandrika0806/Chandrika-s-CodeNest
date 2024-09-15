import java.util.Scanner;
public class StringCombiner1 {
    public static String combineStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int lenA = a.length();
        int lenB = b.length();
        int minLength = Math.min(lenA, lenB);
        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }
        if (lenA > lenB) {
            result.append(a.substring(lenB));
        } else {
            result.append(b.substring(lenA));
        }        
        return result.toString();
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
