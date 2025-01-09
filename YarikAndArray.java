import java.util.*;

public class YarikAndArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
       
        while(T-- > 0){
           int n = sc.nextInt();
           int[] a = new int[n];

           for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
           }
           
           long maxi = a[0];
           long sum  = 0;
           int parity = Math.abs(a[0]%2);

           for(int i=1; i<n; i++){
              if(sum < 0){
                sum = 0;
              }

              if(Math.abs(a[i]%2) != parity){
                sum += a[i];
              }
              else{
                sum = a[i];
              }
    
              maxi = Math.max(maxi, sum);
              parity = Math.abs(a[i]%2);
           }
           System.out.println(maxi);
        }
    }
}
