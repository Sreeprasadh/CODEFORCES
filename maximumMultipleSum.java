import java.util.*;
public class maximumMultipleSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
           int n = sc.nextInt();
           int maxi = Integer.MIN_VALUE;
           int ans = -1;
           for(int i=2; i<=n; i++){
             
              int sum = 0;
              int j=1;
              while(j*i <=n){
                sum += (j*i);
                j++;
              }
              if(maxi < sum){
                maxi = sum;
                ans = i;
              }

           }
           System.out.println(ans);

        }
    }
}
