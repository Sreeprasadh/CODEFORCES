import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C_Deep_Down_Below {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
           int n = sc.nextInt();
           ArrayList<long[]> pair = new ArrayList<>();
           for(int i=0; i<n; i++){
              int k = sc.nextInt();
              long[] a = new long[k];
              long mx = -1;

              for(int j=0; j<k; j++){
                  a[j] = sc.nextLong();
                  a[j] = a[j] - j;
                  mx = Math.max(mx, a[j]);
              }

              pair.add(new long[] {mx, k});
           }

           Collections.sort(pair, (a,b) -> Long.compare(a[0],b[0]));
           long l = 1, h = (long)1e10;
           long ans = 0;

           while (l <= h) {
                long mid = l + (h-l)/2;
                long curpower = mid;
                boolean can = true;

                for(long[] arr : pair){
                    if (arr[0] >= curpower) {
                        can = false;
                        break;
                    }
                    curpower += arr[1];
                }

                if (can) {
                    ans = mid;
                    h = mid-1;
                }else{
                    l = mid+1;
                }
           }

           System.out.println(ans);
        }

        sc.close();
    }
}