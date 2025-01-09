import java.util.*;

public class A_Counting_Orders {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        long mod = 1000000000+7;
        while(T-- >0){
            
           int n = sc.nextInt();
           long[] a = new long[n];
           long[] b = new long[n];

           for(int i=0; i<n; i++){
              a[i] = sc.nextLong();
           }
           for(int i=0; i<n; i++){
              b[i] = sc.nextLong(); 
           }

           Arrays.sort(a);
           Arrays.sort(b);
           
           long[] res = new long[n];

           int j =0;
           for(int i=0; i<n; i++){

              while (j < n && a[j] <= b[i]) {
                  j++;
              }
              if(j < n){
                res[i] = n - j; 
              }
           }

           Arrays.sort(res);
           
           long ans = 1;

           for(int k=0; k<res.length; k++){   
               ans = (((ans % mod) * (res[k] - k)%mod)%mod);   
           }
           System.out.println(ans);
        }
    }
}