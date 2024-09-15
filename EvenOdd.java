public class EvenOdd {
    public static int countNumbers(int num1, int num2, int num3, int num4, int num5, String type) {
        int count = 0;
        int[] numbers = {num1, num2, num3, num4, num5};
        if (type.equalsIgnoreCase("even")) {
            for (int number : numbers) {
                if (number % 2 == 0) {
                    count++;
                }
            }
        } else if (type.equalsIgnoreCase("odd")) {
            for (int number : numbers) {
                if (number % 2 != 0) {
                    count++;
                }
            }
        } else {
            throw new IllegalArgumentException("The type must be 'even' or 'odd'.");
        }

        return count;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter the fourth number: ");
        int num4 = scanner.nextInt();
        System.out.print("Enter the fifth number: ");
        int num5 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter 'even' or 'odd': ");
        String type = scanner.nextLine();
        int result = countNumbers(num1, num2, num3, num4, num5, type);
        System.out.println("Count: " + result);
        scanner.close();
    }
}
