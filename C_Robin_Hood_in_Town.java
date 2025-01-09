import java.util.Arrays;
import java.util.Scanner;

public class C_Robin_Hood_in_Town {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt();  // Number of citizens
            long[] a = new long[n];
            long total = 0;

            // Reading the wealth of each citizen
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                total += a[i];
            }

            // If n is <= 2, the problem doesn't make sense (based on your logic)
            if (n <= 2) {
                System.out.println(-1);
                continue;
            }
            Arrays.sort(a);

            long req = a[n/2] * 2 * n+1;
            req = req - total;

            if(req <= 0){
                System.out.println(0);
            }else{
                System.out.println(req);
            }
        }

        sc.close();
    }
}



