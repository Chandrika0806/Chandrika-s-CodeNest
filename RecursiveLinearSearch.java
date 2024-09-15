import java.util.Scanner;
public class RecursiveLinearSearch {
    public static int recursiveLinearSearch(int[] arr, int key, int index) {
        if (index == arr.length) {
            return -1;
        }
        
        if (arr[index] == key) {
            return index;
        }
        
        return recursiveLinearSearch(arr, key, index + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();
        int result = recursiveLinearSearch(arr, key, 0);
        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("-1");
        }
        
        scanner.close();
    }
}
