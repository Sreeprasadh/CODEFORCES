import java.lang.reflect.Array;
import java.util.*;

public class A_Copil_Copac_Draws_Trees {
    private static int ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] edges = new int[n-1][2];

            for(int i=0; i<n-1; i++){
                edges[i][0] = sc.nextInt();
                edges[i][1] = sc.nextInt();

                edges[i][0]--;
                edges[i][1]--;
            }
            ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
            for(int i=0; i<n; i++){
                adj.add(new ArrayList<>());
            }
            for(int i=0; i<n-1; i++){
                int u = edges[i][0];
                int v = edges[i][1];

                adj.get(u).add(new int[]{v,i});
                adj.get(v).add(new int[]{u,i});
            }
            ans = 0;

            dfs(0, -1, adj, -1, 1);
            System.out.println(ans);
        }
        
        sc.close();
    }
    private static void dfs(int node, int parent, ArrayList<ArrayList<int[]>> adj, int idx, int iteration){

        ans = Math.max(ans, iteration);

        for(int[] a : adj.get(node)){
            int adjnode = a[0];
            int ind = a[1];
            if(adjnode == parent){
                continue;
            }

            dfs(adjnode, node, adj, ind, (iteration + ((ind < idx) ? 1 : 0)));
        }
    }
}