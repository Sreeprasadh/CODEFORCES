import java.util.*;

public class B_Lunatic_Never_Content {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- >0){
            
           int n = sc.nextInt();
           long[] a = new long[n];

           for(int i=0; i<n; i++){
              a[i] = sc.nextLong();
           }


           long gcd = 0;
           for(int i=0; i<(n+1)/2; i++){
               gcd = findGcd(gcd, Math.abs(a[i] - a[n-i-1]));
           }
    
           System.out.println(gcd);
        }
    }

    private static long findGcd(long a, long b){
        while (b != 0) {
            long temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}