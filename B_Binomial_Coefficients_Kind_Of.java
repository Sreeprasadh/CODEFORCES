import java.math.BigInteger;
import java.util.Scanner;

public class B_Binomial_Coefficients_Kind_Of {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long MOD = 1000000000+7;
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];
        
        for(int i=0; i<n; i++){
            x[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            y[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            long result = BigInteger.valueOf(2).modPow(BigInteger.valueOf(y[i]), BigInteger.valueOf(MOD)).longValue();
            System.out.println(result);
        }

        sc.close();
    }
}

