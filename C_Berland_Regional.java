import java.util.*;

public class C_Berland_Regional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] u = new int[n];
            int[] s = new int[n];

            for(int i=0; i<n; i++){
                u[i] = sc.nextInt() -1;
            }

            for(int i=0; i<n; i++){
                s[i] = sc.nextInt();
            }

           List<List<Integer>> bst = new ArrayList<>();
           for(int i=0; i<n; i++){
                bst.add(new ArrayList<>());
           }

           for(int i=0; i<n; i++){
                bst.get(u[i]).add(s[i]);
           }

           for(List<Integer> lst : bst){
                lst.sort(Collections.reverseOrder());
           }

           List<List<Long>> pre = new ArrayList<>();
           for(int i=0; i<n; i++){
                List<Long> prefix = new ArrayList<>();
                prefix.add(0L);

                for(int x : bst.get(i)){
                    prefix.add(prefix.get(prefix.size()-1) + x);
                }
                pre.add(prefix);
           }

           long[] ans = new long[n];
           for(int i=0; i<n; i++){
                int sz = bst.get(i).size();
                for(int k=1; k<=sz; k++){
                   int nearest = (sz/k) * k;
                   ans[k-1] += (pre.get(i).get(nearest));
                }
           }

           for(int i=0; i<n; i++){
              System.out.print(ans[i] + " ");
           }
           System.out.println();
        }
        sc.close();
    }
}