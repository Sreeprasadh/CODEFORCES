import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class C_Product_of_Three_Numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
          
        while (t-- > 0) {
            int n = sc.nextInt(); 
           
            Set<Integer> set = new HashSet<>();
            for(int i=2; i*i <=n; i++){
                if (n%i == 0 && !set.contains(i)) {
                    set.add(i);
                    n = n/i;
                    break;
                }
            }

            for(int i=2; i*i <=n; i++){
                if (n%i == 0 && !set.contains(i)) {
                    set.add(i);
                    n = n/i;
                    break;
                }
            }
            
            if(set.size() < 2 || set.contains(n)){
                System.out.println("NO ");
            }else{
                
                set.add(n);
                System.out.println("YES ");
                for(int num : set){
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}