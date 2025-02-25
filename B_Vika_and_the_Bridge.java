import java.util.Arrays;
import java.util.Scanner;

public class B_Vika_and_the_Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] c = new int[n];
            for(int i=0;i<n; i++){
                c[i] = sc.nextInt();
            }

            int[] last = new int[k];
            Arrays.fill(last, -1);

            int[] maxstep = new int[k];
            int[] max2step = new int[k];

            for(int i=0; i<n; i++){

                int steps = i - last[c[i] -1];

                if(steps > maxstep[c[i] - 1]){
                    max2step[c[i] - 1] = maxstep[c[i] - 1];
                    maxstep[c[i] - 1] = steps;
                }
                else if(steps > max2step[c[i] - 1]){
                    max2step[c[i] - 1] = steps;
                }

                last[c[i] - 1] = i;
            }

            for(int i=0; i < k; i++){
                int steps = n - last[i];
                
                if(steps > maxstep[i]){
                    max2step[i] = maxstep[i];
                    maxstep[i] = steps;
                }
                else if(steps > max2step[i]){
                    max2step[i] = steps;
                }
            }

            int ans = (int)1e9;

            for(int i=0; i<k; i++){

                ans = Math.min(ans, Math.max((maxstep[i] + 1)/2, max2step[i]));
            }
            System.out.println(ans -1);
        }

        sc.close();
    }
}