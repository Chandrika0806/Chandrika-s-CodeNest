import java.util.Scanner;

public class RecursiveUniformBinarySearch {

    public static int recursiveUniformBinarySearch(int[] arr, int key, int[] lookupTable, int left, int right) {
        if (left > right) return -1;
        int mid = left + lookupTable[right - left];
        if (arr[mid] == key) return mid;
        return key < arr[mid] ? 
               recursiveUniformBinarySearch(arr, key, lookupTable, left, mid - 1) : 
               recursiveUniformBinarySearch(arr, key, lookupTable, mid + 1, right);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int[] lookupTable = new int[n];

        System.out.println("Enter the elements of the array (sorted):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            lookupTable[i] = i / 2;        }

        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();

        int result = recursiveUniformBinarySearch(arr, key, lookupTable, 0, n - 1);

        System.out.println(result != -1 ? "Element found at index " + result : "Element not found");

        scanner.close();
    }
}
