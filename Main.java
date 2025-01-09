import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int [] a = new int[n];
            int [] b = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }
            int[] count1 = new int[n];
            int[] count2 = new int[n];

            for(int i=0; i< n; i++){
                count1[a[i]]++;
                count2[a[i]]++;
            }
            long maxi = 1;
            for(int i=0; i<n; i++){
                maxi = Math.max(maxi, count1[i]+count2[i]);
            }
            System.out.println(maxi);
        }
    }
}