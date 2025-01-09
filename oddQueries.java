import java.util.*;
public class oddQueries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            Check(sc); 
        }
        
    
    }
        
    private static boolean Check(Scanner sc){
       
        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] a = new long[(int) (n+1)];
        for(int i=1;i<=n;i++){
            a[i] = sc.nextLong();
        }
        
        while(q-->0){
            long[] pre  = new long[(int) n];
            long l = sc.nextLong();
            long r = sc.nextLong();
            long k = sc.nextLong();
            
            for(int i=1;i<=n;i++){
                pre[i-1] = a[i] + pre[i-2];
            }
            
            long total = pre[(int) (l-1)]+ pre[n] - pre[(int) r] +k*(r-l+1);
            if(isOdd(total)){
                System.out.println("Yes ");
            }
            else
               System.out.println("No ");
        }

        }
        private static boolean isOdd(long num){
            if (num%2 !=0) {
                return true;
            }
            else
               return false;
        }
}
