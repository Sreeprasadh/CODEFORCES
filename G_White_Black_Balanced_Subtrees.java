import java.util.*;

public class G_White_Black_Balanced_Subtrees {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while (t-- > 0) {
            
            int n = sc.nextInt();
            int[] a = new int[n-1];

            for(int i=0; i<n-1; i++){
                a[i] = sc.nextInt();
            }
            String s = sc.next();

            List<List<Integer>> tree= new ArrayList<>();
            for(int i=0; i<=n; i++){
                tree.add(new ArrayList<>());
            }

            int node=2;
            for(int i=0; i<n-1; i++){
                int parent = a[i];
                tree.get(parent).add(node);
                node++;
            }
            int[] result = new int[1];
            dfs(1,tree, s, result);
            System.out.println(result[0]);
        }

        sc.close();
    }

    private static int[] dfs(int node, List<List<Integer>> tree, String s, int[] result){
        int white = 0, black = 0;

        if(s.charAt(node -1) == 'W'){
            white++;
        }else{
            black++;
        }

        for(int child : tree.get(node)){
            int[] childcount = dfs(child, tree, s, result);
            white+= childcount[0];
            black+= childcount[1];
        }

        if(white == black){
            result[0]++;
        }
        
        return new int[]{white, black};
    }
}