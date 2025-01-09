import java.util.*;

public class D_Friends_and_the_Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 
            long[] x = new long[n];
            long[] y = new long[n];

            for(int i=0; i<n; i++){
                x[i] = sc.nextLong();

            }
            for(int i=0; i<n; i++){
                y[i] = sc.nextLong();      
            }

            long[] diff = new long[n];
            for(int i=0; i<n; i++){
                diff[i] = y[i] - x[i];
            }
            Arrays.sort(diff);

            int i=0, j = diff.length-1;
            int cnt = 0;

            while (i < j) {
                if(diff[i] + diff[j] >= 0){
                    cnt++;
                    i++;
                    j--;
                }
                else{
                    i++;
                }
            }
            System.out.println(cnt);
        }

        sc.close();
    }
}