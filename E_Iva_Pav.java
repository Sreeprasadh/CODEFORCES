import java.util.*;

public class E_Iva_Pav {
    public static int N = 200003;
    public static int bits = 30;
    static int[][] prefix;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            buildPrefix(n, a);

            int q = sc.nextInt();

            for(int i=0; i<q; i++){
                int l = sc.nextInt();
                int k = sc.nextInt();

                if(a[l-1] < k){
                    System.out.print(-1 + " ");
                    continue;
                }

                int low = l, high = n;
                int ans = l;

                while(low <= high){
                    int mid = (low + high)/2;

                    int num = 0;

                    for(int j=0; j<30; j++){
                        if((prefix[mid][j] - prefix[l-1][j]) == (mid-l+1)){
                            num += (1 << j);
                        }
                    }

                    if(num >=k){
                        ans = mid;
                        low = mid+1;
                    }else{
                        high = mid-1;
                    }
                }
                System.out.print(ans + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }

    private static void buildPrefix(int n, int[] a){
        prefix = new int[N][bits];
        for(int i=0; i<n; i++){

            for(int j=0; j<30; j++){
                if((a[i] & (1 << j)) !=0){
                    prefix[i+1][j] = prefix[i][j] +1;
                }else{
                    prefix[i+1][j] = prefix[i][j];
                }
            }
        }
    }
}