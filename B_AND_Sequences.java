import java.util.*;

public class B_AND_Sequences {
    static final int mod = (int)1e9+7;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    private static void solve(Scanner sc){
        int n = sc.nextInt();
            int[] a = new int[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            int mini = Arrays.stream(a).min().orElse(0);
            int cnt = 0;

            for(int x : a){
                if(x == mini){
                    cnt++;
                }
                
                if((mini & x) != mini){
                    System.out.println(0);
                    return;
                }
            }

            long fact = 1;
            for(int i=1; i<=n-2; i++){
                fact = (fact * i)%mod;
            }

            long ans = (1L * cnt * (cnt -1))%mod;
            ans = (ans * fact)%mod;
            System.out.println(ans);

    }
}