import java.util.*;

public class D_Zero_Remainder_Array {
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
        int k = sc.nextInt();
        int[] a = new int[n];
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        Map<Integer, Integer> map= new HashMap<>();

        for(int num : a){
            if(num%k == 0){
                continue;
            }

            int rem = num%k;
            map.put(rem, map.getOrDefault(rem, 0)+1);
        }

        long mx = 0;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int rem = entry.getKey();
            int cnt = entry.getValue();

            mx = Math.max(mx, (1L *k*cnt)-rem);
        }
        if(mx == 0){
            System.out.println(0);
        }else{
            System.out.println(mx+1);
        }
    }
}