import java.util.*;

public class E_Mirror_Grid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
      
        while (t-- > 0) {
            int n = sc.nextInt(); 
            sc.nextLine();

            int[][] mat = new int[n][n];

            for (int i = 0; i < n; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < n; j++) {
                    mat[i][j] = line.charAt(j) - '0';  // Convert char '0' or '1' to int 0 or 1
                }
            }

            int ans  = 0;

            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    int op = mat[i][j] + mat[j][n-i-1] + mat[n-i-1][n-j-1] + mat[n-j-1][i];

                    ans += (Math.min(op, 4-op));
                }
            }
            System.out.println(ans/4);
        }

        sc.close();
    }
}