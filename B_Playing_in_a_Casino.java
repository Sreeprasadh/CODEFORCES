import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class B_Playing_in_a_Casino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            // Using BigInteger for large number calculations
            BigInteger[][] mat = new BigInteger[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = sc.nextBigInteger(); // Read input as BigInteger
                }
            }

            // Sorting each column
            for (int j = 0; j < m; j++) {
                BigInteger[] col = new BigInteger[n];
                for (int i = 0; i < n; i++) {
                    col[i] = mat[i][j];
                }
                Arrays.sort(col, (a, b) -> a.compareTo(b)); // Sort BigInteger array
                for (int i = 0; i < n; i++) {
                    mat[i][j] = col[i];
                }
            }

            BigInteger res = BigInteger.ZERO;

            for (int j = 0; j < m; j++) {
                BigInteger[] suff = new BigInteger[n];
                suff[n - 1] = mat[n - 1][j];
                for (int i = n - 2; i >= 0; i--) {
                    suff[i] = suff[i + 1].add(mat[i][j]);
                }

                for (int i = 0; i < n - 1; i++) {
                    BigInteger cnt = suff[i + 1].subtract(BigInteger.valueOf(n - i - 1).multiply(mat[i][j]));
                    res = res.add(cnt);
                }
            }
            System.out.println(res);
        }

        sc.close();
    }
}
 