import java.util.*;

public class A_Robin_Helps {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
          
           int n = sc.nextInt();
           int k = sc.nextInt();

           int[] a = new int[n];
           for(int i=0; i<n; i++){
             a[i] = sc.nextInt();
           }

           int rh = 0;
           int cnt = 0;
           for(int i=0; i<n; i++){
                if(a[i] >= k){
                    rh += a[i];
                }else if(a[i] == 0){
                    if(rh > 0){
                        cnt++;
                        rh--;
                    }
                }
           }
           System.out.println(cnt);
           
        }
        sc.close();
    }
}