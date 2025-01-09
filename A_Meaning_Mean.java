import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class A_Meaning_Mean {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int t = sc.nextInt();
          
        while (t-- >0) {
            
            int n = sc.nextInt();

            int[] a = new int[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);
            long val = (a[0] + a[1])/2;

            for(int i=2; i<n; i++){
                val = (val + a[i])/2;
            }

            
            System.out.println(val);
        }
        sc.close();
    }
}