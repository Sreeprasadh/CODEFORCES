import java.util.*;

public class C_Scoring_Subsequences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases

        while (t-- > 0) {
        
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            int count = 1;
            System.out.print(1 + " ");

            for(int i=1; i<n; i++){

                if(a[i-count] >= (count+1)){
                    count++;
                }

                System.out.print(count + " ");
            }
            System.out.println();   
        }

        sc.close();
    }
}