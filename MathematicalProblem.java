import java.util.*;

public class MathematicalProblem {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- >0){
            int n = sc.nextInt();
            String s = sc.next();

            if(n == 2){
                System.out.println(Integer.parseInt(s));
                continue;
            }
            
            boolean flag = false;
            int ans = Integer.MAX_VALUE;
            for(int i=0; i<n-1; i++){
               
                ArrayList<Integer> list = new ArrayList<>();
                for(int j=0; j<i; j++){
                   int intval = Character.getNumericValue(s.charAt(j));
                   list.add(intval);
                }
                int twodigval = Integer.parseInt(s.substring(i, i+2));
                list.add(twodigval);

                for(int j=i+2; j<n; j++){
                   int intval = Character.getNumericValue(s.charAt(j));
                   list.add(intval);
                }

                Collections.sort(list);
                if(list.get(0) == 0){
                    flag = true;
                    break;
                }
                
                int sum = 0;
                for(int j=0; j<n-1; j++){
                    if(list.get(j) != 1){
                        sum+= list.get(j);
                    }
                }

                if(sum == 0){
                    sum = 1;
                }
                ans = Math.min(ans, sum);
            }
            if(flag){
                System.out.println(0);
            }
            else{
                System.out.println(ans);
            }

        }

    }
    
}