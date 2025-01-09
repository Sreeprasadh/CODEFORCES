import java.util.*;
public class goodPrefix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
           int n = sc.nextInt();
           long[] a = new long[n];

           for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
           }
           
           long prefixSum = 0;
           int cnt = 0;

           long maxel = -1;

           for(int i=0; i<n; i++){
            maxel = Math.max(maxel, a[i]);
            prefixSum += a[i];

            if(prefixSum - maxel == maxel){
                cnt ++;
            }
           }
           System.out.println(cnt);
        }
    }
}