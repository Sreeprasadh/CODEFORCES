import java.util.Scanner;

public class loneliness {
    public static int loneliness(int n, int[] arr) {
        // Calculate the initial OR of the first k elements
        int initialOr = arr[0];
        for (int i = 1; i < n; i++) {
            initialOr |= arr[i];
        }

        // Iterate from k = 1 to k = n
        for (int k = 1; k <= n; k++) {
            int currentOr = initialOr;
            for (int i = 0; i + k < n; i++) {
                // Update the current OR by removing the contribution of the leftmost element
                // and adding the contribution of the rightmost element
                currentOr &= ~arr[i];
                currentOr |= arr[i + k];
                if (currentOr != initialOr) {
                    break;
                }
            }
            if (currentOr == initialOr) {
                return k;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt(); // Length of the array
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt(); // Elements of the array
            }
            System.out.println(loneliness(n, arr));
        }
        scanner.close();
    }
}
