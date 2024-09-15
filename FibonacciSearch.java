import java.util.Scanner;

public class FibonacciSearch {

    public static int fibonacciSearch(int[] arr, int key) {
        int n = arr.length;
        int fibM2 = 0, fibM1 = 1, fibM = fibM1 + fibM2;
        while (fibM < n) {
            fibM2 = fibM1;
            fibM1 = fibM;
            fibM = fibM1 + fibM2;
        }

        int offset = -1;
        while (fibM > 1) {
            int i = Math.min(offset + fibM2, n - 1);
            if (arr[i] < key) {
                fibM = fibM1;
                fibM1 = fibM2;
                fibM2 = fibM - fibM1;
                offset = i;
            } else if (arr[i] > key) {
                fibM = fibM2;
                fibM1 -= fibM2;
                fibM2 = fibM - fibM1;
            } else {
                return i;
            }
        }
        return (fibM1 == 1 && arr[offset + 1] == key) ? offset + 1 : -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the sorted elements of the array:");
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        int result = fibonacciSearch(arr, key);
        System.out.println(result != -1 ? "Element found at index " + result : "Element not found");

        scanner.close();
    }
}
