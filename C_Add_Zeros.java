import java.util.*;

public class C_Add_Zeros {
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            long[] a = new long[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }

            Set<Long> set = new HashSet<>();
            set.add((long)n);

            List<long[]> list = new ArrayList<>();

            for(int i=1; i<n; i++){
                list.add(new long[]{a[i]+i , i});
            }

            Collections.sort(list, (x,y) -> Long.compare(x[0], y[0]));

            int len =list.size();
            long ans = n;

            for(int i=0; i<len; i++){
                long size = list.get(i)[0];

                if(set.contains(size)){
                    ans = Math.max(ans, size+list.get(i)[1]);
                    set.add(size+list.get(i)[1]);
                }
            }
            System.out.println(ans);
        }
        
        sc.close();
    }
 
}