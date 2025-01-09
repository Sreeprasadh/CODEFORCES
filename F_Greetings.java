import java.util.*;

public class F_Greetings {
    static List<Pair> arr;
    static TreeSet<Integer> set;
    static int ans;

    static class Pair implements Comparable<Pair>{
        int first;
        int second;

        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair o){
            if(this.first != o.first) return Integer.compare(this.first, o.first);
            return Integer.compare(this.second, o.second);
        }
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    private static void solve(Scanner sc){
        int n = sc.nextInt();

        arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr.add(new Pair(a, b));
        }

        Collections.sort(arr);
        ans = 0;
        set = new TreeSet<>();

        for(Pair p : arr){
            ans += set.size() - set.headSet(p.second).size();

            set.add(p.second);
        }
        System.out.println(ans);
    }

}