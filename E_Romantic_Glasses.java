import java.util.*;

public class E_Romantic_Glasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
           int n = sc.nextInt();
        
           long[] a = new long[n];

           for(int i=0; i<n; i++){
              a[i] = sc.nextLong();
           }

           Map<Long, Integer> map = new HashMap<>();

           long sum = 0;
           map.put(0L, 1);
           boolean f = false;

           for(int i=0; i<n ; i++){
               a[i] *= ((i%2)==0?-1 : 1);

               sum += a[i];

               if(map.containsKey(sum)){
                    f = true;
                    break;
               }

               map.put(sum, map.getOrDefault(sum, 0)+1);
           }

           if (f) {
              System.out.println("YES ");
           }else{
              System.out.println("NO ");
           }
        }

        sc.close();
    }
}