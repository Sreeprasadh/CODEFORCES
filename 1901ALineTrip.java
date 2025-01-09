import java.util.*;
public class 1901ALineTrip{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int gs, p=0;
            int ans=0;
            for(int i=0;i<n;i++){
                gs= sc.nextInt();
                
                ans = Math.max(ans, gs- p);
                p = gs;
            }
            ans = Math.max(ans, 2*(x-p));
            System.out.println(ans);
            
           t--; 
        }
    }
}