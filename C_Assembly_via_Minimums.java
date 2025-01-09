import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class C_Assembly_via_Minimums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
           
            int len = (n*(n-1)/2);

            long[] b = new long[len];

            for(int i=0; i<len; i++){
                b[i] = sc.nextLong();
            }
            
            Arrays.sort(b);
            int last = 0;

            for(int i=1; i<n; i++){
                System.out.print(b[last] + " ");
                last += (n-i);
            }
            int lastel = (int)1e9;
            System.out.print(lastel);
            System.out.println();

        }
        sc.close();
    }
}