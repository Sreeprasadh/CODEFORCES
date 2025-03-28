import java.util.*;

public class D_Jumping_Through_Segments {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- >0) {
            int n = sc.nextInt();
            int[][] a = new int[n][2];

            for(int i=0; i<n; i++){
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }

            int ans = (int)1e9, low = 0, high = (int)1e9; 

            while (low <= high) {
                int mid = low + (high-low)/2;

                if (isPossible(mid, a)) {
                    ans = mid;
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            System.out.println(ans);
        }
       
    }

    private static boolean isPossible(int k, int[][] a){
        int x = 0, y = 0;
        for(int[] range : a){
            x -= k;
            y += k;

            x = Math.max(x, range[0]);
            y = Math.min(y, range[1]);

            if(x > y){
                return false;
            }
        }
        return true;
    }
}