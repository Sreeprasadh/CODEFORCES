import java.util.*;

public class B_Stalin_Sort {
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            long[] a = new long[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }

            int[] maxRightcnt = new int[n];

            for(int i=0; i<n; i++){
                long cur = a[i];
                int cnt=0;
                for(int j=i+1; j<n; j++){
                    if(cur >= a[j]){
                        cnt++;
                    }
                }
                maxRightcnt[i] = cnt;
            }
            
            int maxCnt = 0;

            for(int i=0; i<n; i++){
                maxCnt = Math.max(maxCnt, maxRightcnt[i]);
            }

            System.out.println(n - (maxCnt+1));
        }
        
        sc.close();
    }
 
}