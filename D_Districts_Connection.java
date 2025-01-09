import java.util.Map.Entry;
import java.util.*;

public class D_Districts_Connection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
           int n = sc.nextInt();

           long[] a= new long[n];
           
           Set<Long> set = new HashSet<>();
           Map<Long, ArrayList<Integer>> map = new HashMap<>();

           for(int i=0; i<n; i++){
              a[i] = sc.nextLong();
              set.add(a[i]);
              map.computeIfAbsent(a[i], k->new ArrayList<>()).add(i);
           }

           if(set.size()==1){
              System.out.println("NO ");
              continue;
           }

           System.out.println("YES ");
           
           ArrayList<ArrayList<Integer>> indiceList = new ArrayList<>(map.values());

           for(int i=1; i<indiceList.size(); i++){

                for(int index : indiceList.get(i)){
                    System.out.println((indiceList.get(0).get(0)+1) + " " + (index+1));
                }
           }

           for(int i=1; i<indiceList.get(0).size(); i++){
              System.out.println((indiceList.get(0).get(i) + 1) + " " + (indiceList.get(1).get(0) + 1));
           }
        }

        sc.close();
    }
}