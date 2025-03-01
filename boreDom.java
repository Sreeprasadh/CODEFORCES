import java.util.*;

public class boreDom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[] a = new int[n];

            int maxval = 0;
            for(int i =0; i<n; i++){
                a[i] = sc.nextInt();
                maxval = Math.max(maxval, a[i]);
            }

            int[] freq = new int[maxval + 1];
            long[] dp = new long[maxval + 1];

            for(int val : a){
                freq[val] ++;
            }

            Arrays.fill(dp, -1);

            long ans =  Solve(maxval,freq, dp);
            System.out.println(ans);
        

    }
    private static long Solve(int num,int[] freq, long[] dp){

        if(num <= 0) return 0;

        if(dp[num] != -1) {
            return dp[num];
        }
        //nottake 
        long nottake = Solve(num -1,freq, dp);

        //take
       
        long take = (long) num * freq[num] + Solve(num - 2 , freq, dp);

        dp[num] =  Math.max(nottake, take);

        return dp[num];
    }
}
