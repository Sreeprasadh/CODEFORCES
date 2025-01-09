import java.util.*;
public class Tuple{
    long first;
    long second;

    Tuple(long first, long second){
        this.first = first;
        this.second = second;
    }
}
public class LukeIsAFoodie {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            long x = sc.nextLong();

            long[] a = new long[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }
            ArrayList<Tuple> v = new ArrayList<>();
            for(int i=0; i<n; i++){
                v.add(new Tuple(a[i] -x, a[i] + x));
            }

            Tuple T = v.get(0);
            long ans = 0;

            for(int i=1; i<n; i++){
                
                Tuple cur = v.get(i);
               
                Tuple overlap = new Tuple(Math.max(T.first, cur.first), Math.min(T.second, cur.second));

                if(overlap.first <= overlap.second){
                    T = overlap;

                }
                else{
                    T = cur;
                    ans++;
                }
            }
            System.out.println(ans);
        }

    }
}
