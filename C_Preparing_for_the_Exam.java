import java.util.*;

public class C_Preparing_for_the_Exam { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); 

        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        int[] listQn = new int[m];
        long totalSum = (n * (n + 1L)) / 2; 
        
        for (int i = 0; i < m; i++) {
            listQn[i] = sc.nextInt();
        }

        int[] heKnows = new int[k];
        long knownSum = 0;
        for (int i = 0; i < k; i++) {
            heKnows[i] = sc.nextInt();
            knownSum += heKnows[i];
        }

        
        long missing = totalSum - knownSum;

        
        if (n - k > 1) {
            System.out.println("0".repeat(m));
            return;
        }

        
        if (n == k) {
            System.out.println("1".repeat(m));
            return;
        }

        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < m; i++) {
            if (listQn[i] == missing) {
                result.append('1');
            } else {
                result.append('0');
            }
        }
        System.out.println(result);
    }
}
