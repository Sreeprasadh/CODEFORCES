import java.util.*;

public class B_Medians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int MedianOfArray = (n+1)/2;

            if(n==1 && k==1){
                System.out.println(1);
                System.out.println(1);
            }else if(k ==n || k==1){
                System.out.println(-1);
            }else{
                
                System.out.println(3);
                    
                System.out.print(1 + " " + ((k-1)%2 ==1 ? k: (k-1) ) + " " + ((k-1)%2 == 1 ? (k+1) : (k+2)));
                System.out.println();
                
            }
        }
        
        sc.close();
    }
 
}