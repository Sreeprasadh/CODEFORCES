import java.util.*;

public class G_1_Dances_Easy_version {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];
            a[0] = 1;

            for(int i=1; i<n; i++){
                a[i] = sc.nextInt();
            }

            for(int i=0; i<n; i++){
                b[i] = sc.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            int i=n-1, j=n-1, k=0;
            int minop = 0;

            while (j >= k && i>=0) {
                if(a[i] < b[j]){
                    i--;
                    j--;
                }else{
                    minop++;
                    i--;
                    k++;
                }
            }
            System.out.println(minop);
        }
        
        sc.close();
    }
}