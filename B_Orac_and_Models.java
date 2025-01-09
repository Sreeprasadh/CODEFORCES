import java.util.*;

public class B_Orac_and_Models {
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

        int[] s = new int[n+1];
        for(int i=0; i<n; i++){
            s[i+1] = sc.nextInt();
        }

        int[] f = new int[n+2];
        Arrays.fill(f, 1);

        for(int i=1; i<=n; i++){

            for(int j=i*2; j<=n; j+=i){

                if(s[i] < s[j]){
                    f[j] = Math.max(f[j], f[i]+1);
                }
            }
        }

        int maxi = 0;
        for(int i=1; i<=n; i++){
            maxi = Math.max(maxi, f[i]);
        }
        System.out.println(maxi);
    }
}