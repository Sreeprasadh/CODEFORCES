import java.util.*;

public class beautifullllarray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- >0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            
            long[] a = new long[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);
            if(n%2 == 0){
                long ans = 0;

                for(int i=0; i<n-1; i++){
                   ans += (a[i+1] - a[i]);
                }
                System.out.println(ans);
            }
            else{
                long ans = 0;

                for(int i=1; i<n-1; i++){
                   ans += (a[i+1] - a[i]);
                }
                System.out.println(ans);
            }
            continue;
        }

    }
}