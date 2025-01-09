import java.util.*;

public class B_Cat_Cycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n= sc.nextLong();
            long k = sc.nextLong();

            k--;//make it zero based for ease of use

            if(n%2 == 0){
                long ans = k%n;
                System.out.println(ans+1);
            }else{
                long mid = (n/2);

                long gaps = (k/mid);

                long ans = (gaps + k)%n;

                System.out.println(ans+1);
            }
        }

        sc.close();
    }
}