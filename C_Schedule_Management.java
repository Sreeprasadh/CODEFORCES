import java.util.*;

public class C_Schedule_Management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] index = new int[m];
            int[] count = new int[n+1];
            for(int i=0; i<m; i++){
                index[i] = sc.nextInt();

                count[index[i]]++;
            }

            int low = 0, high = m;
            int result = high;

            while (low <= high) {
                int mid = (low + high)/2;

                long completed = 0;

                for(int i=1; i<=n; i++){

                    if(count[i] >= mid){
                        completed += mid;
                    }else{
                        completed += (count[i] + (mid - count[i])/2);
                    }
                }

                if(completed >= m){
                    result = mid;
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            System.out.println(result);
        }
        
        sc.close();
    }
 
}