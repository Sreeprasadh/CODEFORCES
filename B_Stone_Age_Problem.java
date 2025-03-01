import java.util.*;
public class B_Stone_Age_Problem {

    private static final int N = 200000 + 10;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        long[] a = new long[N];
        int[] firstInd = new int[N];
        long sum = 0;

        for(int i=1; i<=n; i++){
            a[i] = sc.nextLong();
            sum += a[i];
        }

        long lastSecondVal = 0;
        int lastSecondInd = 0;

        for(int i=1; i<=q; i++){
            int t = sc.nextInt();

            if(t == 1){
                int ind = sc.nextInt();
                long val = sc.nextLong();

                if(firstInd[ind] < lastSecondInd){
                    sum -= lastSecondVal;
                }else{
                    sum -= a[ind];
                }

                a[ind] = val;
                sum += val;
                firstInd[ind] = i;
            }else{
                long val = sc.nextLong();

                sum = n * val;
                lastSecondVal = val;
                lastSecondInd = i;
            }
            System.out.println(sum);
        }
        
        sc.close();
    }
}
