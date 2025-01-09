import java.util.*;

public class Quests {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
       
        while(T-- > 0){
           int n = sc.nextInt();
           int k = sc.nextInt();

           int[] a = new int[n];
           for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
           }
           int[] b = new int[n];
           for(int i=0; i<n; i++){
            b[i] = sc.nextInt();
           }
 
           long ans =0;
           int maxi = 0;
           long sum =0;
           for(int i=0; i<Math.min(n,k); i++){
               sum += a[i];
               maxi = Math.max(maxi, b[i]);

               ans = Math.max(ans, sum + maxi * ((k-i-1)));
           }
           System.out.println(ans);
        }
    }
}