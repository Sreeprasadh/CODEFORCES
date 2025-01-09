import java.util.*;

public class B_Journey { 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt(); 
    
            while (t-- > 0) {
                solve(sc);
            }
            sc.close();
        }
    
        private static void solve(Scanner sc) {
           long n = sc.nextLong();
            
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long tot = a+ b+c;

            long full = n/tot;
            long rem= n%tot;

            long trips = 3 * full;

            if(rem > 0){
                if(rem <= a){
                    trips+=1;
                }else if(rem <= a+b){
                    trips+=2;
                }else{
                    trips+=3;
                }
            }
            System.out.println(trips);
        
        }
}