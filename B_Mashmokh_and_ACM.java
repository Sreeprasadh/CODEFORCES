import java.util.*;

public class B_Mashmokh_and_ACM {
    static long MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long[][] dp = new long[n+1][k+1];
        for(long[] row : dp){
            Arrays.fill(row, -1);
        }

        long res = 0;
        for(int i=1; i<=n; i++){
            res = (res + solve(i, k, n, dp))%MOD;
        }
        System.out.println(res);
       
        
        sc.close();
    }

    private static long solve(int i, int k, int n, long[][] dp){

        //base case
        if(k == 1){
            return 1;
        }

        if(dp[i][k] != -1){
            return dp[i][k];
        }

        long ans = 0;

        for(int j=i; j<=n; j+=i){
            ans = ( ans + solve(j, k-1, n, dp) )%MOD;
        }
        dp[i][k] = ans;
        return ans;
    }
}