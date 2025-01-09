import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B_Square_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
           int n = sc.nextInt();
           String s = sc.next();


           if(isPerfectSquare(n) == false){
             System.out.println("NO ");
           }
           else{
              int k = (int)Math.sqrt(n);
              boolean flag = true;

              for(int i=0; i<k; i++){
                 if (s.charAt(i) == '0') {
                    flag = false;
                    break;
                 }
              }

              for(int i=n-1; i>=(n-k); i--){
                if (s.charAt(i) == '0') {
                    flag = false;
                    break;
                }
              }

              if (flag==false) {
                 System.out.println("NO ");
                 continue;
              }

             

              for(int i=k; i<(n-k); i+=k){
                 int zerocnt = 0;
                 String sub = s.substring(i, i+k);
                 if (sub.charAt(0) == '0' || sub.charAt((k-1)) == '0') {
                    flag = false;
                    break;
                 }
                 for(int j=0; j<k; j++){
                    if (sub.charAt(j) == '0') {
                        zerocnt++;
                    }
                 }
                 if (zerocnt == 0) {
                    flag = false;
                    break;
                 }
              }
              if (flag == false) {
                System.out.println("NO ");
              }
              else{
                System.out.println("YES ");
              }

           }


        }

        sc.close();
    }
    private static boolean isPerfectSquare(int n){
        if (n < 0) {
            return false;
        }
        int s = (int)Math.sqrt(n);
        return s*s == n;
    }
}