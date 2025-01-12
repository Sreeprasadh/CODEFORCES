import java.util.*;

public class B_Hossam_and_Friends {
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            N = 100005;
            int[] notFriendStart = new int[N];
            Arrays.fill(notFriendStart, n+1);

            for(int i=0; i<m; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();

                if(x > y){
                    int temp = x;
                    x = y;
                    y = temp;
                }

                notFriendStart[x] = Math.min(notFriendStart[x], y);
            }

            for(int i=n-1; i>=1; i--){
                notFriendStart[i] = Math.min(notFriendStart[i], notFriendStart[i+1]);
            }

            long res = 0;

            for(int i=1; i<=n; i++){
                res += (notFriendStart[i] - i);
            }
            System.out.println(res);
        }
        
        sc.close();
    }
 
}