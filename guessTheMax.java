import java.util.*;
public class guessTheMax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){

            int n= sc.nextInt();
            long[] a = new long[n];

            for(int i=0 ; i<n; i++){
                a[i] = sc.nextLong();
            }
            long mini = (long) 1e9;
            long maxi = -1;

            for(int i=1; i<n; i++){
               maxi = Math.max(a[i-1], a[i]);
               mini = Math.min(mini, maxi);
            }
            System.out.println(mini-1);
        }
        
    }
}