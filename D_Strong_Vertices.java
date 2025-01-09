import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class D_Strong_Vertices {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
        
            int n = sc.nextInt();

            long[] a = new long[n];
            long[] b = new long[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }
            for(int i=0; i<n; i++){
                b[i] = sc.nextLong();
            }

            long[] c = new long[n];
            long maxi = Long.MIN_VALUE;

            for(int i=0; i<n; i++){
                c[i] = a[i] - b[i];
                maxi = Math.max(maxi, c[i]);
            }

            ArrayList<Long> list = new ArrayList<>();

            for(int i=0; i<n; i++){
                if(c[i] == maxi){
                    list.add((long)(i+1));
                }
            }
            System.out.println(list.size());
            for(int i=0; i<list.size(); i++){
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}