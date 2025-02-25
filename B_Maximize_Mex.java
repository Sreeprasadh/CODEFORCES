import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class B_Maximize_Mex {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int t = sc.nextInt();
          
        while (t-- >0) {
            
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] a = new int[n];

            Map<Integer, Integer> map1 = new HashMap<>();
            Map<Integer, Integer> map2 = new HashMap<>();
            
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
                map1.put(a[i], map1.getOrDefault(a[i], 0)+1);
            }
            
          
            int i=0;
            while(true){
                if(map1.containsKey(i)){
                   map1.put(i, map1.getOrDefault(i, 0) -1);

                   int rem = map1.get(i);
                   map2.put(i%x, map2.getOrDefault(i%x, 0) + rem);
                }else if(map2.containsKey(i%x) && map2.get(i%x) > 0){
                    map2.put(i%x, map2.getOrDefault(i%x, 0) - 1);
                }else{
                    break;
                }
                i++;
            }
            System.out.println(i);

        }
        sc.close();
    }
}