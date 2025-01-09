import java.util.*;

public class B_Minimise_Oneness {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
       
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < n - 1; i++) {
                sb.append('0');
            }
            
            sb.append('1');
            
            System.out.println(sb.toString());
        }
        
        sc.close();
    }
}
