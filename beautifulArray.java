import java.util.*;

public class beautifulArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long s = sc.nextLong();
            long q = sc.nextLong();
            long[] a = new long[n];
            a[0] = x * s;
            q -= x * s;
            if (q < 0) {
                System.out.println("-1");
            } else {
                for (int i = 0; i < n; ++i) {
                    long now = Math.min(x - 1, q);
                    a[i] += now;
                    q -= now;
                }
                if (q > 0) {
                    System.out.println("-1");
                } else {
                    for (int i = 0; i < n; ++i) {
                        System.out.print(a[i] + " ");
                    }
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
