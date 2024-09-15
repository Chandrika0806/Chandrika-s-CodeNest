import java.util.Scanner;

public class RecursiveBinarySearch {

    public static int recursiveBinarySearch(int[] arr, int key, int left, int right) {
        if (left > right) return -1;
        int mid = left + (right - left) / 2;
        if (arr[mid] == key) return mid;
        return key < arr[mid] ? 
               recursiveBinarySearch(arr, key, left, mid - 1) : 
               recursiveBinarySearch(arr, key, mid + 1, right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array (sorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        int result = recursiveBinarySearch(arr, key, 0, n - 1);

        System.out.println(result != -1 ? "Element found at index " + result : "Element not found");

        scanner.close();
    }
}
