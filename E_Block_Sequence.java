import java.util.*;

public class E_Block_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
    public static int n;

    private static void solve(Scanner sc) {
        n = sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int[] dp = new int[n+1];
        
        for(int i=n-1; i>=0; i--){
            int take = Integer.MAX_VALUE;
            int nottake = Integer.MAX_VALUE;
    
            if(i + a[i] < n){
                take = 0 + dp[i+a[i]+1];
            }
    
            nottake = 1 + dp[i+1];
    
            dp[i] = Math.min(take, nottake);
        }

        int ans = dp[0];
        System.out.println(ans);
    }
}