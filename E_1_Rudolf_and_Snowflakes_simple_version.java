import java.util.*;
import java.util.HashMap;;

public class E_1_Rudolf_and_Snowflakes_simple_version {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
        
            long n = sc.nextLong();
            Map<Long, Integer> map = new HashMap<>();

            for(int k=2; k<=1000; k++){
                long val = 1 + k;
                long p = k * k;
    
                for(int cnt=2; cnt<=20; cnt++){
                   val += p;
    
                   if (val > 1e6) {
                     break;
                   }
                   map.put(val, 1);
                   p *= k;
                }
            }
    
            if (map.containsKey(n)) {
                System.out.println("YES ");
            }else{
                System.out.println("NO ");
            }
            
        }

        sc.close();
    }
}