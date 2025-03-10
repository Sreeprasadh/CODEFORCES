import java.util.*;

public class B_Gardener_and_the_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while (t-- > 0) {
            
            int n = sc.nextInt();

            int[] k = new int[n];
            Map<Integer, Integer> map = new HashMap<>();
            List<List<Integer>> bits = new ArrayList<>();

            for(int i=0; i<n; i++){
                k[i] = sc.nextInt();

                List<Integer> curgrp = new ArrayList<>();

                for(int j=0; j<k[i]; j++){
                    int p = sc.nextInt();

                    curgrp.add(p);
                    map.put(p, map.getOrDefault(p, 0)+1);
                }
                bits.add(curgrp);
            }

            String ans = "No ";

            for(int i=0; i<n; i++){
                boolean found = false;

                for(int element : bits.get(i)){
                    if(map.get(element) == 1){
                        found = true;
                        break;
                    }
                }

                if(!found){
                    ans = "YES ";
                    break;
                }
            }
            System.out.println(ans);

        }

        sc.close();
    }
}