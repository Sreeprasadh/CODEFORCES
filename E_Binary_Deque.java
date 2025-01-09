import java.util.*;

public class E_Binary_Deque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
      
        while (t-- > 0) {
            int n = sc.nextInt(); 
            int s = sc.nextInt();

            int[] a = new int[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            long[] prefix = new long[n];
            prefix[0] = a[0];
            for(int i=1; i<n; i++){
                prefix[i] = prefix[i-1] + a[i];
            }

            int ans = Integer.MAX_VALUE;

            for(int i=0; i<n; i++){

                int l = i, r = n-1;
                int pos = -1;

                while (l <= r) {
                    int mid = (l+r) >> 1;

                    if(find(i, mid, prefix) <= s){
                        pos = mid;
                        l = mid + 1;
                    }
                    else{
                        r = mid - 1;
                    }
                }
                if(pos == -1 || find(i,pos,prefix)!=s) continue;

                ans = Math.min(ans, (n - (pos-i+1)));
            }

            System.out.println(ans == Integer.MAX_VALUE ? -1 : ans );
          
        }

        sc.close();
    }

    private static long find(int l, int r, long[]prefix){
        return prefix[r] - (l>0 ? prefix[l-1] : 0);
    }
}