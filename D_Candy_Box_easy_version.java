import java.util.*;

public class D_Candy_Box_easy_version {
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

        int[] a = new int[n];
        Map<Integer, Integer> map= new HashMap<>();

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            map.put(a[i], map.getOrDefault(a[i], 0)+1);
        }
        
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.add(entry.getValue());
        }

        Collections.sort(list, Collections.reverseOrder());
        int ans = 0;

        int len = list.size();

        for(int i=0; i<len; i++){
            if(i==0){
                ans += list.get(i);
            }else{
                if(list.get(i) >= list.get(i-1)){
                    list.set(i, list.get(i-1) -1);


                    ans += list.get(i);

                    if(list.get(i) == 0){
                        break;
                    }
                }else{
                    ans += list.get(i);
                }
            }
        }
        System.out.println(ans);
    }

}