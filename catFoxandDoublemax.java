import java.util.*;
public class catFoxandDoublemax{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] p = new int[n];
            int[] q = new int[n];

            ArrayList<Pair> list = new ArrayList<>();
            TreeSet<Integer> ts = new TreeSet<>();
            int cur = -1;

            for(int i=1; i<=n; i++){
                ts.add(i);
            }

            for(int i=0; i<n; i++){
                p[i] = sc.nextInt();
                if(p[i] == 1){
                    cur = i;
                }
            }

            for(int i=0; i<n; i++){

                if(i%2 != cur%2){
                    q[i] = n - p[i] +2;
                    ts.remove(q[i]);
                }
                else{
                    list.add(new Pair(p[i], i));
                }

            }
            //sort the list in descending order
            list.sort((a,b) -> Integer.compare(b.first, a.first));

            int j=0;
            for(int it : ts){
                q[list.get(j++).second] = it;
            }
            for(int i=0; i<n; i++){
                System.out.print(q[i]+" ");
            }
            System.out.println();

        }
    }
}
class Pair{
    int first;
    int second;
    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}