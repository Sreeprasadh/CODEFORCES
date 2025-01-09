import java.util.*;

public class D_1_The_Endspeaker_Easy_Version {
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            long[] a=  new long[n];
            long[] b = new long[m];

            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }
            for(int j=0;j<m; j++){
                b[j] = sc.nextLong();
            }

            long[] pre = new long[n];
            pre[0] = a[0];
            for(int i=1; i<n; i++){
                pre[i] = pre[i-1] + a[i];
            }

            int[] dp = new int[n+1];
            Arrays.fill(dp, (int)1e9);
            dp[0] = 0;

            for(int i=1; i<=m; i++){

                long sum = b[i-1];

                for(int j=0; j<n; j++){
                    if(dp[j] == (int)1e9){
                        continue;
                    }
                    int idx = upperBound(pre, sum + (j==0 ? 0 : pre[j-1]));

                    if(idx == j){
                        continue;
                    }

                    dp[idx] = Math.min(dp[idx], dp[j] + (m-i));
                }
            }
            System.out.println(dp[n] == (int)1e9 ? -1 :dp[n]);
        }
        
        sc.close();
    }
    
    private static int upperBound(long[] pre, long target){

        int low = 0, high = pre.length;
        

        while (low < high) {
            int mid = (low+high)/2;

            if(pre[mid] <= target){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        return low;
    }
}