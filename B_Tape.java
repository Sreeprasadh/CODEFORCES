import java.util.*;

public class B_Tape {
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        solve(sc);
        
        sc.close();
    }

    private static void solve(Scanner sc){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] broken = new int[n];
        for(int i=0; i<n; i++){
            broken[i]  = sc.nextInt();
        }

        List<Integer> diff = new ArrayList<>();

        if(k==1){
            System.out.println(broken[n-1] - broken[0] +1);
        }else{
            for(int i=1; i<n; i++){
                diff.add(broken[i] - broken[i-1]-1);
            }
            Collections.sort(diff);

            long worst = broken[n-1] - broken[0] +1;

            int ind = diff.size()-1;
            long sum = 0;

            for(int i=2; i <=k; i++){
                sum += diff.get(ind);
                ind--;
            }
            System.out.println(worst - sum);
        }
    }
}