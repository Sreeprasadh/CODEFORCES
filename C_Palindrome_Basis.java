import java.util.*;

public class C_Palindrome_Basis {
    public static final int MOD = 1000000007;
    public static final int N = 40000; // Maximum value for n
    public static int[][] dp; // Maximum palindrome size is up to 502
    public static List<Integer> palindromes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Precompute all palindromes
        generatePalindromes();

        solve();

        int t = sc.nextInt();
        while (t-- > 0) { 
            int n = sc.nextInt();
            System.out.println(dp[n][palindromes.size()]); // Use palindromes.size() for the last column
        }
    }

    // Generate all palindromes up to N
    private static void generatePalindromes() {
       
        for (int i = 1; i <= N; i++) {
            if (isPalindrome(i)) {
                palindromes.add(i);
            }
        }
    }

    // Check if a number is a palindrome
    private static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }

    // Precompute the DP table
    private static void solve(){
        int m = palindromes.size();

        dp = new int[N+1][m+1];


        for(int i=0; i<=m; i++){
            dp[0][i] = 1;
        }
        
        for(int i=1; i<=N; i++){
            for(int j=1; j<=m; j++){

                int pick = 0;
                if(i-palindromes.get(j-1) >= 0){
                    pick = dp[i-palindromes.get(j-1)][j];
                }
                
                int notpick = dp[i][j-1];
        
                dp[i][j] = (pick+notpick)%MOD;
            }
        }
    }
}


