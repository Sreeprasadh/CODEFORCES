import java.util.*;

public class B_Battle_for_Survive {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
          
           int n = sc.nextInt();
           long[]a  = new long[n];
           for(int i=0; i<n; i++){
               a[i] = sc.nextLong();
           }

           long last = a[n-1];
           long rem = a[n-2];

           for(int i=n-3; i>=0; i--){
              rem = rem - a[i];
           }

           System.out.println(last - rem);
           
        }
        sc.close();
    }
}