import java.util.*;

public class B_Lost_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, List<Integer>> map = new HashMap<>();
        
        int[] arr = new int[]{4, 8, 15, 16, 23, 42};

        for(int i=0; i<6; i++){
            for(int j=i+1; j<6; j++){
               int prod = arr[i] * arr[j];
               map.computeIfAbsent(prod, k -> new ArrayList<>()).add(arr[i]);
               map.computeIfAbsent(prod, k -> new ArrayList<>()).add(arr[j]);
            }
        }

        solve(sc, map);
        
        sc.close();
    }

    private static void solve(Scanner sc, Map<Integer, List<Integer>> map){
       
       int[] QueryAns = new int[4];
       List<Integer> res = new ArrayList<>();

       System.out.println("? " + 1 + " " + 2);
       System.out.flush();
       QueryAns[0] = sc.nextInt();

       System.out.println("? " + 2 + " " + 3);
       System.out.flush();
       QueryAns[1] = sc.nextInt();

       System.out.println("? " + 4 + " " + 5);
       System.out.flush();
       QueryAns[2] = sc.nextInt();

       System.out.println("? " + 5 + " " + 6);
       System.out.flush();
       QueryAns[3] = sc.nextInt();
       
       for(int i=0; i<4; i+=2){
            int prod1 = QueryAns[i];
            int prod2 = QueryAns[i+1];

            List<Integer> numbers1 = map.get(prod1);
            List<Integer> numbers2 = map.get(prod2);

            int mid = 0;
            if(numbers1.get(0) == numbers2.get(0)){
                mid = numbers1.get(0);
            }else if(numbers1.get(0) == numbers2.get(1)){
                mid = numbers1.get(0);
            }else if(numbers1.get(1) == numbers2.get(0)){
                mid = numbers1.get(1);
            }else if(numbers1.get(1) == numbers2.get(1)){
                mid = numbers1.get(1);
            }

          
            res.add(prod1/mid);
            res.add(mid);
            res.add(prod2/mid);
       }
       System.out.print("!");

       for(int i=0; i<6; i++){
           System.out.print(" " + res.get(i));
       }
       System.out.println();
       System.out.flush();

    }

}