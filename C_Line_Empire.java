import java.util.*;

public class C_Line_Empire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long a = sc.nextLong();
        long b = sc.nextLong();

        long[] arr = new long[n+1];
        for(int i=1; i<=n; i++){
            arr[i] = sc.nextLong();
        }

        long[] prefix = new long[n+1];
       
        for(int i=1; i<=n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        long res = Long.MAX_VALUE;

        for(int i=0; i<=n; i++){
            if(i==0){
                res = b*(prefix[n] - ((n-i)*arr[0]));
            }else{
                long cur = b*((prefix[n]-prefix[i]) - ((n-i)*arr[i]));
                cur += ((a+b)*(arr[i]-arr[0]));
                res = Math.min(res, cur);
            }
        }
        System.out.println(res);
    }
}