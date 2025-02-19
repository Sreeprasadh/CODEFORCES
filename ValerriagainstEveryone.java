import java.util.*;

public class ValerriagainstEveryone {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            long[] a = new long[n];
          
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();

            }

            boolean flag = false;
            Map<Long, Integer> map = new HashMap<>();

            for(int i=0; i<n;i++){
               map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            }
            
            for(Map.Entry<Long, Integer> entry : map.entrySet()){
                long val = entry.getKey();
                int count = entry.getValue();

                if (count > 1) {
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println("YES ");
            }
            else{
                System.out.println("NO ");
            }
        }

    }
}