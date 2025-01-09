import java.util.*;

public class C_A_TRUE_Battle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            String s = sc.next();


            if(s.charAt(0) =='1' || s.charAt(n-1) =='1'){
                System.out.println("YES ");
            }else{
                boolean alice = false;
                for(int i=0; i<n-1; i++){
                    if(s.charAt(i) == '1' && s.charAt(i+1) =='1'){
                       alice = true;
                       break;
                    }   
                }
    
                if (alice) {
                    System.out.println("YES ");
                }else{
                    System.out.println("NO ");
                }
            }
        }
        
        sc.close();
    }
}