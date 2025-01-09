import java.util.*;

public class B_Robin_Hood_and_the_Major_Oak {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
          
           long n = sc.nextLong();
           long k = sc.nextLong();

           long add = k - 1;
           long L = n - add;
           long R = n;

           long firstEven = (L % 2 == 0) ? L : L + 1;
           long lastEven = (R % 2 == 0) ? R : R - 1;
           long evens = (firstEven <= lastEven) ? (lastEven - firstEven) / 2 + 1 : 0;

        
           long firstOdd = (L % 2 != 0) ? L : L + 1;
           long lastOdd = (R % 2 != 0) ? R : R - 1;
           long odds = (firstOdd <= lastOdd) ? (lastOdd - firstOdd) / 2 + 1 : 0;

           if(odds%2 == 1){
              System.out.println("NO ");
           }else{
            System.out.println("YES ");
           }
        }
        sc.close();
    }
}