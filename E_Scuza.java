import java.util.*;

public class E_Scuza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            long[] a = new long[n];
            long[] k = new long[q];

            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }

            for(int i=0; i<q; i++){
                k[i] = sc.nextLong();
            }

            long[] prefix = new long[n+1];
            long[] maxi = new long[n+1];

            prefix[0] = 0;
            maxi[0] = 0;

            for(int i=0; i<n; i++){
                prefix[i+1] = a[i] + prefix[i];

                maxi[i + 1] = Math.max(maxi[i], a[i]);
                
            }

            for(int i=0; i<q; i++){
                long el = k[i];

                int ind = binarySearch(maxi, el);

                if(ind < 0){
                    System.out.print(0 + " ");
                }
                else{
                    System.out.print(prefix[ind] + " ");
                }
                
            }
            System.out.println();
        }

        sc.close();
    }

    private static int binarySearch(long[] a, long target){

        int l = 0, h = a.length - 1;

        while (l <= h) {
            int mid = l + (h - l)/2;

            if(a[mid] <= target){
                l = mid + 1;
            }
            else{
                h = mid - 1;
            }
        }

        return h;
    }
}