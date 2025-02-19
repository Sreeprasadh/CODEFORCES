import java.util.*;

public class B_Maximum_Sum {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            long[] a = new long[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);
            long[] pre = new long[n+1];

            for(int i=0; i<n; i++){
                pre[i+1] = pre[i] + a[i];
            }

            long maxi = 0;
            for(int i=0; i<=k; i++){
               maxi = Math.max(maxi, pre[n-i] -  pre[2*(k-i)]);
            }
            System.out.println(maxi);

        }
    }
}