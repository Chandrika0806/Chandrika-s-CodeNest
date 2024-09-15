import java.util.Scanner;
public class PadovanSequence {
    public static int[] generatePadovanSequence(int n) {
        if (n <= 0) {
            return new int[0]; 
        }
        int[] sequence = new int[n];
        if (n >= 1) sequence[0] = 1;
        if (n >= 2) sequence[1] = 1;
        if (n >= 3) sequence[2] = 1;
        for (int i = 3; i < n; i++) {
            sequence[i] = sequence[i - 2] + sequence[i - 3];
        }
        
        return sequence;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Padovan sequence: ");
        int n = scanner.nextInt();
        int[] sequence = generatePadovanSequence(n);
        System.out.println("Padovan sequence:");
        for (int num : sequence) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}
