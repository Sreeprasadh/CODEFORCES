import java.util.*;

public class D_Divide_and_Equalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
           int n = sc.nextInt();
           int[] a = new int[n];

           Map<Integer, Integer> map = new HashMap<>();

           for(int i=0; i<n; i++){
              a[i] = sc.nextInt();
              findPrimeFactors(a[i], map);
           }

           boolean f = true;

           for(Map.Entry<Integer, Integer> entry : map.entrySet()){
                int cnt = entry.getValue();

                if(cnt%n != 0){
                    f = false;
                    break;
                }
           }
          
           if(f){
              System.out.println("YES ");
           }else{
              System.out.println("NO ");
           }
          
        }
        sc.close();
    }

    private static void findPrimeFactors(int n, Map<Integer, Integer> map) {
        
        while (n%2 == 0) {
            map.put(2, map.getOrDefault(2, 0)+1);
            n = n/2;
        }

        for(int i=3; i<= Math.sqrt(n); i+=2){
            while (n%i==0) {
                map.put(i, map.getOrDefault(i, 0)+1);
                n/=i;
            }
        }

        if(n > 2){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
    }
}