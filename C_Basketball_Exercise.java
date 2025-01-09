import java.util.*;

public class C_Basketball_Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }

    private static void solve(Scanner sc){
        int n = sc.nextInt();
        long[][] dp = new long[2][n+2];
        int[][] h = new int[2][n+2];

        for(int i=0; i<2; i++){
            for(int j=1; j<=n; j++){
                h[i][j] = sc.nextInt();
            }
        }

        for(int i=1; i<=n; i++){
            dp[0][i] = Math.max(dp[0][i-1], dp[1][i-1] + h[0][i]);

            dp[1][i] = Math.max(dp[1][i-1], dp[0][i-1] + h[1][i]);
        }
        System.out.println(Math.max(dp[0][n], dp[1][n]));
    }
}