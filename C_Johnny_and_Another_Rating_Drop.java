import java.util.*;

public class C_Johnny_and_Another_Rating_Drop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    private static void solve(Scanner sc){
        long n = sc.nextLong();
        
        int Nbits  = find(n);
        long res = 0;

        for(int i=0; i<Nbits; i++){
            long pos = (long) Math.pow(2, i);

            res += (n/pos);
        }
        System.out.println(res);

    }

    private static int find(long n){
        return (int)(Math.log(n) / Math.log(2)) + 1;
    }
}