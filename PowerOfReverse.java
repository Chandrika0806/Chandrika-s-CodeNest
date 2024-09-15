import java.util.Scanner;

public class PowerOfReverse {
    static final int MOD = 1000000007;

    // Function to reverse a number
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    // Function to perform modular exponentiation
    public static long power(int N, int R) {
        long result = 1;
        long base = N % MOD;
        while (R > 0) {
            if ((R & 1) == 1) result = (result * base) % MOD;
            base = (base * base) % MOD;
            R >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();        // Take input N from console
        int R = reverse(N);          // Reverse the number to get R
        System.out.println(power(N, R));  // Compute and print the result
    }
}
