import java.util.*;

public class B_Pleasant_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n + 1]; // Use long instead of int
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextLong(); // Read as long
            }

            int cnt = 0;

            for (int i = 1; i <= n; i++) {
                // j starts from a[i] - i, increment by a[i]
                for (long j = a[i] - i; j <= n; j += a[i]) {
                    if (j >= 1 && j <= n) { // Ensure j is within valid bounds
                        if (i < j && a[i] * a[(int)j] == (i + j)) { // Cast j to int for array access
                            cnt++;
                        }
                    }
                }
            }
            System.out.println(cnt);
        }

        sc.close();
    }
}
