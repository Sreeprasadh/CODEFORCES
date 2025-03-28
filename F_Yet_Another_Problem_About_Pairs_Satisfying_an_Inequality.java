import java.util.*;

public class F_Yet_Another_Problem_About_Pairs_Satisfying_an_Inequality {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while (t-- > 0) {
            
            int n = sc.nextInt();
            long[] a = new long[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }

            long[] validNumbers = new long[n+1];

            for(int i=0; i<n; i++){
                if(a[i] < (i+1)){
                    validNumbers[i+1] = validNumbers[i] + 1;
                }else{
                    validNumbers[i+1] = validNumbers[i];
                }
            }

            long ans = 0;
            for(int i=1; i<n; i++){
                if(a[i] < (i+1) && a[i] > 0){
                    ans += (validNumbers[(int)a[i]-1]);
                }
            }
            System.out.println(ans);
        }

        sc.close();
    }
}