import java.util.*;

public class D_Counting_Pairs { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 

        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        long x = sc.nextLong();
        long y = sc.nextLong();

        long[] a = new long[n];
        long total = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            total += a[i];
        }

        x = total-x;
        y = total-y;
        // Sort the array for binary search
        Arrays.sort(a);

        long res = 0;
        for(int i=0; i<n; i++){
            int l = lowerBound(a, y-a[i]);
            int r = upperBound(a, x-a[i]);

            res += Math.max(0, r-l);
            if(l<=i && i<r){
                --res;
            }
            
        }
        res/=2;
        System.out.println(res);
        
    }

    private static int lowerBound(long[] a, long target){
        int l=0, h = a.length;

        while(l < h){
            int mid = l+(h-l)/2;

            if(a[mid] < target){
                l = mid+1;
            }else{
                h = mid;
            }
        }
        return l;
    }

    private static int upperBound(long[] a, long target){
        int l=0, h= a.length;
        
        while(l < h){
            int mid = l + (h-l)/2;

            if(a[mid] <= target){
                l = mid+1;
            }else{
                h = mid;
            }
        }
        return l;
    }
}
