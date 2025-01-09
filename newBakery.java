import java.util.*;

public class newBakery {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            
            long n = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            
            if(a >=b){
                long ans = (n*a);
                System.out.println(ans);
                continue;
            }
            else{
                if(b-a > n){
                    long ans = ((b * (b+1))/2) - (((b - n)*(b - n + 1))/2);
                    System.out.println(ans);
                    continue;
                }
                else{
                    long ans = (((b * (b+1))/2) - ((a * (a+1))/2));

                    n = n - (b -a);
                    ans += (n * a);
                    System.out.println(ans);
                    continue;
                }
            }
        }
    }
}