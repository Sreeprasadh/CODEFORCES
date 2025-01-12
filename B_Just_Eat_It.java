import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class B_Just_Eat_It {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
          
        while (t-- > 0) {
            int n = sc.nextInt(); 
           
            int[] a = new int[n];
            long total = 0;

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
                total += a[i];
            }

            boolean flag = true;
            int cnt = 0;

            long sum = 0;
            for(int i=0; i<n; i++){
                sum += a[i];
                cnt++;

                if(sum >= total && cnt<n){
                    flag = false;
                    break;
                }

                if(sum <= 0){ 
                    sum  = 0;
                    cnt = 0;
                }

            }

            if (flag) {
                System.out.println("YES ");
            }else{
                System.out.println("NO ");
            }
        }
        sc.close();
    }
}