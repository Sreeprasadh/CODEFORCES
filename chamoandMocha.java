import java.util.*;
public class chamoandMocha{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){

            int n = sc.nextInt();
            long[] a = new long[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }

            if(n==2){
                System.out.println(Math.min(a[0], a[1]));
            }

            else{
                long maxi = -1;
                for(int i=0; i<n-2; i++){
                    long[] b = new long[3];
                    int ind =0;
                    for(int j=i; j<=i+2; j++){
                        b[ind++] = a[j];
                    }
                    Arrays.sort(b);
                    maxi = Math.max(maxi, b[1]);
                }
                System.out.println(maxi);
            }

        }
    }
}