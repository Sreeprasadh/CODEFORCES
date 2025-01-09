import java.util.*;

public class AliceandBooks {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
           
            int[] a = new int[n];
            for(int i=0;i<n; i++){
                a[i] = sc.nextInt();
            }

            int maxi =0;
            for(int i=0; i<n-1; i++){
               maxi = Math.max(maxi, a[i]);
            }
            System.out.println(maxi + a[n-1]);
        }
    }
}