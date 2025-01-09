import java.util.*;

public class A_Rectangle_Arrangement {
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int maxHi = -1, maxWi = -1;

            for(int i=0; i<n; i++){
                int w = sc.nextInt();
                int h = sc.nextInt();

                maxWi = Math.max(maxWi, w);
                maxHi = Math.max(maxHi, h);
            }
            System.out.println(2*maxHi + 2*maxWi);
        }
        
        sc.close();
    }
 
}