import java.util.Scanner;

public class B_Minimize_Equal_Sum_Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];

            for (int i = 0; i < n; i++) {
                p[i] = sc.nextInt();
            }

           
            for(int i=1; i<n; i++){
                System.out.print(p[i] +" ");
            }
            System.out.print(p[0]);
            System.out.println();
        }

        sc.close();
    }
}
