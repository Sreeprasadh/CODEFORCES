import java.util.Scanner;

public class C_Chat_Ban {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long k = sc.nextLong();
            long x = sc.nextLong();

            long total = k*k;

            long l=1, h = 2*k-1;
            long ans = 0;

            while (l <= h) {
                long mid = l + (h-l)/2;

                long req = 0;

                if(mid > k){
                    long diff = mid - k;
                    long val = k - diff;
                    req = total - ((val * (val+1))/2);
                }else{
                    req = (mid * (mid - 1))/2;

                }

                if(x > req){
                    ans = mid;
                    l  = mid+1;
                }else{
                    h = mid -1;
                }
            }
            System.out.println(ans);
        }

        sc.close();
    }
}






