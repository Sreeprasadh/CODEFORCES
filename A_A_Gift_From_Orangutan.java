import java.util.*;

public class A_A_Gift_From_Orangutan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- >0) {
           int n = sc.nextInt();
           int[] a = new int[n];
           
           int maxi = -1;
           int mini = Integer.MAX_VALUE;

           for(int i=0; i<n; i++){
              a[i] = sc.nextInt();
              maxi = Math.max(maxi, a[i]);
              mini = Math.min(mini, a[i]);
           }

           int total = 0;

           for(int i=1; i<n; i++){
              total += (maxi - mini);
           }
           System.out.println(total);
        }
       
    }
}