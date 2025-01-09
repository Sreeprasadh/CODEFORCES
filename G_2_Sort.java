import java.util.*;

public class G_2_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            long[] a = new long[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }

            int[] possible = new int[n-1];

            for(int i=0; i<n-1; i++){
                if(a[i] < 2*a[i+1]){
                    possible[i] = 1;
                }
            }

            int i=0, j=0;
            int cnt =0;
            while(j < n-1){
                if(possible[j] == 0){
                    j++;
                    i=j;
                }else if(j-i + 1 == k){
                    cnt++;
                    j++;
                    i++;
                }else if(j < (n-1) && possible[j] == 1){
                    j++;
                }
            }
            System.out.println(cnt);
        }
        
        sc.close();
    }
 
}