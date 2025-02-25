import java.util.*;

public class DoubleEndedStrings {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while(T-- >0){

           String a = sc.next();
           String b = sc.next();

           int n = a.length();
           int m = b.length();
           
           int[][] dp = new int[n+1][m+1];           
         
           int longest = 0;

           for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){

                if(a.charAt(i-1) == b.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    longest = Math.max(longest, dp[i][j]);
                }
                else{
                    dp[i][j] = 0;
                }
            }
           }
           int ans = (n-longest) + (m-longest);
           System.out.println(ans);
           continue;

        }
    }
   
}