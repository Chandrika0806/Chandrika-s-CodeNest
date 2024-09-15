import java.util.Scanner;

public class MeanCalculator {
    public static double calculateMean(int[] arr) {
        if (arr.length == 0) {
            return 0; 
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        double mean = calculateMean(arr);
        System.out.printf("The mean of the elements in the array is: %.2f%n", mean);
        scanner.close();
    }
}
