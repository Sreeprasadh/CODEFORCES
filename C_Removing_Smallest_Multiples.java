import java.util.*;

public class C_Removing_Smallest_Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            int n = sc.nextInt(); 

            String s = sc.next();

            int[] marked = new int[n+1];
            long cost = 0;

            for(int i=0; i<n; i++){

                if(s.charAt(i) == '0'){

                    for(int j=(i+1); j<=n; j+=(i+1)){

                        if (s.charAt(j-1) == '1') {
                            break;
                        }

                        if (marked[j] == 1) {
                            continue;
                        }

                        marked[j] = 1;
                        cost += (i+1);
                    }
                }
            }
            System.out.println(cost);
        }

        sc.close();
    }
}