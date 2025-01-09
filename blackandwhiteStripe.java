import java.util.*;
public class blackandwhiteStripe{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();
            
            int[] prefix = new int[n+1];

            for(int i=1; i<=n; i++){
                prefix[i] = prefix[i-1];
                if(s.charAt(i-1) == 'B'){
                    prefix[i]++;
                }
            }
            int temp = n;
            for(int i=k; i<=n; i++){
              temp = Math.min(temp, k - (prefix[i] - prefix[i-k]));
            }
            System.out.println(temp);
        }
    }
}