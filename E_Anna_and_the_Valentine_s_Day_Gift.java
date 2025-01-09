import java.util.*;

public class E_Anna_and_the_Valentine_s_Day_Gift {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- >0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            List<Integer> zeroes = new ArrayList<>();

            for(int num : a){

                int zcnt =0, dig = 0;

                while(num%10 == 0){
                    zcnt++;
                    num/=10;
                }

                while (num!=0) {
                    num/=10;
                    dig++;
                }
                zeroes.add(zcnt);
                m = m - dig;
            }

            Collections.sort(zeroes, Collections.reverseOrder());

            for(int i=1; i<zeroes.size(); i+=2){
                m = m - zeroes.get(i);
            }

            System.out.println((m<0) ? "Sasha" : "Anna");
        }
       
    }
}