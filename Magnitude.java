import java.util.*;
public class Magnitude{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
           int n = sc.nextInt();
           long[] a = new long[n];
           
           for(int i=0; i<n; i++){
              a[i] = sc.nextLong();
           }

           long[] pre = new long[n];
           long[] suf = new long[n];
           
           pre[0] = a[0];
           for(int i=1; i<n; i++){
              pre[i] = pre[i-1] + a[i];
           }
           suf[n-1] = a[n-1];
           for(int i=n-2; i>=0 ; i--){
              suf[i] = suf[i+1] + a[i];
           }
           long ans = Math.abs(pre[n-1]);

           for(int i=0; i<n-1; i++){
              long maxi = Math.abs(pre[i]) + suf[i+1];
              ans = Math.max(ans, maxi);
           }
           System.out.println(ans);
        }
    }
}
