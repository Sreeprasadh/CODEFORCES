import java.util.*;

public class E_Data_Structures_Fan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }
    public static int n;

    private static void solve(Scanner sc) {
        n = sc.nextInt();

        int[] a = new int[n+1];
        for(int i=1; i<=n; i++){
            a[i] = sc.nextInt();
        }
        
        String s = sc.next();
        s = "0" + s;

        int q = sc.nextInt();

        int[] ZeroAndOne = {0,0};
        int[] prefix = new int[n+1];

        for(int i=1; i<=n; i++){
            ZeroAndOne[s.charAt(i) - '0'] ^= a[i];
            prefix[i] = prefix[i-1] ^ a[i];
        }   

        int track = 0;

        for(int i=0; i<q; i++){
            int type = sc.nextInt();

            if(type==1){
                int l = sc.nextInt();
                int r = sc.nextInt();

                track ^= prefix[r] ^ prefix[l-1];
            }else{
                int g = sc.nextInt();

                System.out.print((track^ZeroAndOne[g]) + " ");
            }
        }
        System.out.println();
    }
}