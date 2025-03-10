import java.util.Arrays;
import java.util.Scanner;

public class C_Dolce_Vita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
           int n = sc.nextInt();
           long x = sc.nextLong();

           long[] a = new long[n];

           for(int i=0; i<n; i++){
              a[i] = sc.nextLong();
              a[i]--;
           }

           Arrays.sort(a);
           
           long presum = 0 , ans = 0;

           for(int i=0; i<n; i++){
               
              if((x - (presum + a[i]))/(i+1) > 0){
                  ans += (x - (presum + a[i]))/(i+1);
              }

              presum += a[i];
           }
        
           System.out.println(ans);
        }

        sc.close();
    }
}