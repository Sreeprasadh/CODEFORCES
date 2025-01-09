import java.util.*;

public class A_Preparing_for_the_Olympiad { 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt(); 
    
            while (t-- > 0) {
                solve(sc);
            }
            sc.close();
        }
    
        private static void solve(Scanner sc) {
           int n = sc.nextInt();
            
           int[] a = new int[n];
           int[] b = new int[n+1];

           for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
           }
           for(int i=0; i<n; i++){
                b[i] = sc.nextInt();
           }
           b[n] = 0;
           
           long res = 0;

           for(int i=0; i<n; i++){
                if(b[i+1] < a[i]){
                    res += a[i];
                    res -= b[i+1];
                }
           }
           System.out.println(res);
        }
}