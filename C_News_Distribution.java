import java.util.*;
class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();

    public DisjointSet(int n) {
        for (int i = 0; i <= n; i++) {
            //rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }

    // public int findUPar(int node) {
    //     if (node == parent.get(node)) {
    //         return node;
    //     }
    //     int ulp = findUPar(parent.get(node));
    //     parent.set(node, ulp);
    //     return parent.get(node);
    // }

    public int findUPar(int node) {
        if (node != parent.get(node)) {
            parent.set(node, findUPar(parent.get(node))); // Path compression
        }
        return parent.get(node);
    }

    // public void unionByRank(int u, int v) {
    //     int ulp_u = findUPar(u);
    //     int ulp_v = findUPar(v);
    //     if (ulp_u == ulp_v) return;
    //     if (rank.get(ulp_u) < rank.get(ulp_v)) {
    //         parent.set(ulp_u, ulp_v);
    //     } else if (rank.get(ulp_v) < rank.get(ulp_u)) {
    //         parent.set(ulp_v, ulp_u);
    //     } else {
    //         parent.set(ulp_v, ulp_u);
    //         int rankU = rank.get(ulp_u);
    //         rank.set(ulp_u, rankU + 1);
    //     }
    // }

    public void unionBySize(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);

        if (ulp_u == ulp_v) return; // Already in the same set

        // Attach smaller set under the larger set
        if (size.get(ulp_u) < size.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_u) + size.get(ulp_v));
        } else {
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_u) + size.get(ulp_v));
        }
    }

    // public int getSize(int node) {
    //     int ulp = findUPar(node);
    //     return size.get(ulp);
    // }

}

public class C_News_Distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }

    private static void solve(Scanner sc){
        int n = sc.nextInt();
        int m = sc.nextInt();

        DisjointSet ds = new DisjointSet(n);

        for(int i=0; i<m; i++){
            int sz = sc.nextInt();

            if (sz==0) {
                continue;
            }

            int first = sc.nextInt();
            for(int j=1; j<sz; j++){
                int next = sc.nextInt();
                ds.unionBySize(first, next);
            }
        }

        int[] sizes = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int ulparent = ds.findUPar(i);
            sizes[i] = ds.size.get(ulparent);
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(sizes[i] + " ");
        }
        System.out.println();
                
    }
}