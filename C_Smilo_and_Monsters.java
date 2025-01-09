import java.util.*;

public class C_Smilo_and_Monsters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            solve(sc);
        }
        sc.close();
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt(); // Number of hordes
        int[] a = new int[n];

        long sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); 
            sum += a[i];
        }

        Arrays.sort(a); // Sort hordes by number of monsters

        int i=0; 
        long attacks = 0; // Total attacks count
        long res = 0;

        if(sum%2 == 1){
            res = 1;
            a[0]--;
        }

        long half = sum/2;

        while(i<n && attacks+a[i] <= half){
            attacks += a[i];
            i++;
        }

        res = res + half + (n-i);
        System.out.println(res);
    }
}
