import java.util.*;

public class CollectingGame {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
       
        while(T-- > 0){
           int n = sc.nextInt();

           int[] a = new int[n];
           for(int i=0; i<n; i++){
             a[i] = sc.nextInt();
           }

           List<int[]> list = new ArrayList<>();
           for(int i=0; i<n; i++){
              list.add(new int[]{a[i], i});
           }
                   // Sort the list based on the values (first element of each array)
           Collections.sort(list, new Comparator<int[]>() {
              @Override
              public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);  // Compare based on the first element (value)
              }
        });

           long[] pre = new long[n];
           pre[0] = list.get(0)[0];

           for(int i=1; i<n; i++){
              pre[i] = list.get(i)[0] + pre[i-1];
           }

           int[] res = new int[n];
           res[list.get(n-1)[1]] = n-1;

           for(int i=n-2; i>=0; i--){
              if(pre[i] >= list.get(i+1)[0]){
                  res[list.get(i)[1]] = res[list.get(i+1)[1]];
              }
              else{ 
                res[list.get(i)[1]] = i;
              }
               
           }

           for(int i=0; i<n; i++){
            System.out.print(res[i] +" ");
           }
           System.out.println();

        }
    }
}