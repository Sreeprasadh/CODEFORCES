import java.util.*;

public class C_Make_it_Alternating {
    private static final long mod = 998244353;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
           String s = sc.next();
           int n = s.length();

           int min_del = 0;
           int extras = 0;
           long total = 1;
           long factorial = 1;

           for(int i=0; i<n-1; i++){

                if(s.charAt(i) == s.charAt(i+1)){
                    extras++;
                }else{
                    min_del += extras;
                    extras++;

                    total = (total%mod * extras%mod)%mod;
                    extras = 0;
                }
           }

           if (extras != 0) {
                min_del += extras;
                extras++;
                total = (total%mod * extras%mod)%mod;
           }

           for(long i=1; i<=min_del; i++){
                factorial = ((factorial%mod) * (i%mod))%mod;
           }
           System.out.print(min_del + " ");

           long res = ((total%mod) * (factorial%mod))%mod;
           System.out.print(res);
           System.out.println();
        }
        sc.close();
    }
}