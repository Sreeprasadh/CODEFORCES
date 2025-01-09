import java.util.*;

public class numberBox {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] a = new int[n][m];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    a[i][j] = sc.nextInt();
                }
            }
            int sum = 0;
            int cnt = 0;
            int mini = Integer.MAX_VALUE;
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    mini = Math.min(mini, Math.abs(a[i][j]));
                    if(a[i][j] <0){
                        cnt ++;
                    }
                    sum += Math.abs(a[i][j]);
                }
            }
            if (cnt %2 != 0) {
                System.out.println( sum - 2*mini);
            }
            else{
                System.out.println( sum);
            }
           
        }
    }
}