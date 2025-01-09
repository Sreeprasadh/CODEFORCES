import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B_Most_socially_distanced_subsequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int t = sc.nextInt();
          
        while (t-- >0) {
            
            int n = sc.nextInt();

            int[] a = new int[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            List<Integer> ans = new ArrayList<>();

            for(int i=0; i<n; i++){
                if(i==0 || i== n-1 || a[i] > a[i-1]&&a[i] > a[i+1] || a[i] < a[i-1]&&a[i] < a[i+1]){
                    ans.add(a[i]);
                }
            }

            System.out.println(ans.size());
            int sz = ans.size();
            for(int i=0; i<sz; i++){
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}