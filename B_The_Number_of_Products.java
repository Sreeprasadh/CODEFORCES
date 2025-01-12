import java.util.*;

public class B_The_Number_of_Products {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }

    private static void solve(Scanner sc){
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        //dp[i][0] = +ve, dp[i][1] = -ve
        int[][] dp = new int[n+1][2];
        if(a[0] > 0){
            dp[0][0] = 1;
        }else{
            dp[0][1] = 1;
        }

        for(int i=1; i<n; i++){
            if(a[i] > 0){
                dp[i][0] = 1+dp[i-1][0];
                dp[i][1] = dp[i-1][1];
            }else{
                dp[i][0] = dp[i-1][1];
                dp[i][1] = 1+dp[i-1][0];
            }
        }

        long pos =0, neg = 0;

        for(int i=0; i<n; i++){
            pos += dp[i][0];
            neg += dp[i][1];
        }

        System.out.println(neg +" "+ pos);
    }
}