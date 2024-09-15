import java.util.Scanner;

public class InterpolationSearch {

    public static int interpolationSearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right && key >= arr[left] && key <= arr[right]) {
            int pos = left + ((key - arr[left]) * (right - left)) / (arr[right] - arr[left]);
            if (arr[pos] == key) return pos;
            if (arr[pos] < key) left = pos + 1;
            else right = pos - 1;
        }
        return -1;
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

        int result = interpolationSearch(arr, key);
        System.out.println(result != -1 ? "Element found at index " + result : "Element not found");

        scanner.close();
    }
}
