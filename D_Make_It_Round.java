import java.util.*;

public class D_Make_It_Round {
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();

            long ans = n;
            long k=1;

            while (n%10 == 0) {
                n/=10;
            }

            while(n%5 == 0){
                n/=5;
                if(k*2 <= m){
                    k*=2;
                }else{
                    break;
                }
            }

            while (n%2 == 0) {
                n/=2;
                if(k*5 <= m){
                    k*=5;
                }else{
                    break;
                }
            }

            while(k*10 <= m){
                k*=10;
            }

            k = (m/k)*k;
            System.out.println(ans*k);
        }
        
        sc.close();
    }
 
}