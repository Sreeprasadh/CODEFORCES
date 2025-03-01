import java.util.*;

public class H_Maximal_AND {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while (t-- > 0) {
            
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            int[] count = new int[31];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();

                for(int j=30; j>=0; j--){
                    if((a[i] &(1 << j)) != 0){
                        count[j]++;
                    }
                }
            }

            int ans = 0;
            for(int i=30; i>=0; i--){
                int needed = n - count[i];

                if(needed <= k){
                    ans += (1 << i);
                    k -= needed;
                }
            }
            System.out.println(ans);
        }

        sc.close();
    }
}