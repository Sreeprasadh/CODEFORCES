import java.util.*;

public class BeautifulArray2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            long b = sc.nextLong();
            long s = sc.nextLong();

            long minsum = k*b;
            long maxsum = (k*b) + (n *(k-1));

            if(s < minsum || s > maxsum){
                System.out.println(-1);
                continue;
            }
            else{
                long[] a = new long[n];

                a[0] = minsum;
                s -= minsum;

                for(int i=0; i<n; i++){
                        
                        long newv = Math.min(k-1, s);
                        a[i] += newv;
                    
                        s -= newv;
                }
                for(int i=0; i<n; i++){
                    System.out.print(a[i] + " ");
                }
                System.out.println();
                continue;
            }
        }
    }
}