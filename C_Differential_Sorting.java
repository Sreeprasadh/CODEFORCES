import java.util.Arrays;
import java.util.Scanner;

public class C_Differential_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
           int n = sc.nextInt();
           long[] a = new long[n];

           for(int i=0; i<n; i++){
              a[i] = sc.nextLong();
           }

           if(a[n-2] > a[n-1]){
              System.out.println(-1);
           }else{
              
              if(a[n-1] >= 0){

                 System.out.println(n-2);
                 for(int i=1; i<=n-2; i++){
                     System.out.print(i + " ");
                     System.out.print(n-1 + " ");
                     System.out.print(n);
                     System.out.println();
                 }

              }else{
                  
                 boolean f = true;

                 for(int i=0; i<n-1; i++){
                    if(a[i] > a[i+1]){
                        f = false;
                        break;
                    }
                 }

                 if (f) {
                    System.out.println(0);
                 }else{
                    System.out.println(-1);
                 }

              }
           }

        }

        sc.close();
    }
}