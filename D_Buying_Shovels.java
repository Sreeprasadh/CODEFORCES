import java.util.Scanner;

public class D_Buying_Shovels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
          
        while (t-- > 0) {
            int n = sc.nextInt(); // Number of shovels
            int k = sc.nextInt(); // Maximum shovels you can buy in one transaction

            int ans = n; // Initialize answer to n (the maximum number of shovels)
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) { // Check if i is a divisor of n
                    // Check both divisors: i and n/i
                    if (i <= k) {
                        ans = Math.min(ans, n / i); // Calculate number of transactions
                    }
                    if (n / i <= k) {
                        ans = Math.min(ans, i); // Calculate number of transactions
                    }
                }
            }
            System.out.println(ans); // Output the minimum transactions required
        }
        sc.close();
    }
}
