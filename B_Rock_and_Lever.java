import java.util.*;

public class B_Rock_and_Lever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
           int n = sc.nextInt();
        
           long[] a = new long[n];
        
           for(int i=0; i<n; i++){
              a[i] = sc.nextLong();
           }

           boolean[] vis = new boolean[n];
           long total =0;

           for(int i=31; i>=0; i--){

                long cnt = 0;

                for(int j=0; j<n; j++){

                    if(((1 << i) & a[j])!=0 && (!vis[j])){
                        cnt++;
                        vis[j] = true;
                    }
                }

                total += (cnt * (cnt-1))/2;
           }
           System.out.println(total);
           
        }

        sc.close();
    }
}

