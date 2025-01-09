import java.util.*;

public class C_Factorials_and_Powers_of_Two {
        static ArrayList<Long> factorial_two = new ArrayList<>();
    
        
        public static void main(String[] args) {
            generateFactTwo();
            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt(); 
    
            while (t-- > 0) {
                solve(sc);
            }
            sc.close();
        }
    
        private static void solve(Scanner sc) {
           long n = sc.nextLong();
           
           int k = factorial_two.size();

           long total = (1 << k);
           int ans = Integer.MAX_VALUE;

           for(long i=0; i<total; i++){
                long sum = 0;
                int count = 0;

                long p_j = 1;

                for(int j=0; j<k; j++){
                    if((i&p_j) != 0){
                        count++;
                        sum += factorial_two.get(j);
                    }
                    p_j *= 2;
                }

                if(sum>n){
                    continue;
                }

                long rem = n-sum;

                while (rem > 0) {
                    count++;
                    rem = (rem & (rem-1));
                }
                ans = Math.min(ans, count);
           }

           System.out.println(ans);
        }

        private static void generateFactTwo(){
            long fact = 1;
           
            for(int i=1; i<=14; i++){
                fact = fact*i;
                factorial_two.add(fact);
            }
        }
}
