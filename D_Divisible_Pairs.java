import java.util.*;

public class D_Divisible_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
           int n = sc.nextInt();
        
           long x = sc.nextLong();
           long y = sc.nextLong();

           long[] a = new long[n];
           for(int i=0; i<n; i++){
              a[i] = sc.nextLong();
           }

           Map<List<Long>, Integer> map = new HashMap<>();
           long ans = 0;

           for(int i=0 ; i<n; i++){
                long xMod = (x - (a[i]%x)) % x;
                long yMod = a[i] % y;
                List<Long> lst = Arrays.asList(xMod, yMod);

                ans += map.getOrDefault(lst, 0);
                List<Long> cur = Arrays.asList(a[i]%x, a[i]%y);

                map.put(cur, map.getOrDefault(cur, 0)+1);
           }

           System.out.println(ans);
        }

        sc.close();
    }
}