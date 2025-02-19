import java.util.*;

public class C_Ball_in_Berland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    private static void solve(Scanner sc){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();

            int[] indegreeA = new int[a+1];
            int[] indegreeB = new int[b+1];

            int[][] edges = new int[k][2];
            for(int i=0; i<k; i++){
                edges[i][0] = sc.nextInt();
            }
            for(int i=0; i<k; i++){
                edges[i][1] = sc.nextInt();
            }

            for(int i=0; i<k; i++){
                int x = edges[i][0];
                int y = edges[i][1];
                indegreeA[x]++;
                indegreeB[y]++;
            }

            long ans = 0;
            for(int[] edge : edges){
                ans += ((k-1) - (indegreeA[edge[0]]-1) - (indegreeB[edge[1]]-1));
            }
            System.out.println(ans/2);

    }
}