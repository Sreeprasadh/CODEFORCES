import java.util.*;

public class E_Arranging_The_Sheep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int[] left = new int[n];
            int[] right = new int[n];

            int cnt = 0;
            for(int i=0; i<n; i++){
                if(s.charAt(i) == '*'){
                    cnt++;
                }else{
                    left[i] = cnt;
                }
            }

            cnt=0;
            for(int i=n-1; i>=0; i--){
                if(s.charAt(i) == '*'){
                    cnt++;
                }else{
                    right[i] = cnt;
                }
            }

            long total = 0;
            for(int i=0; i<n; i++){
                total += Math.min(left[i], right[i]);
            }
            System.out.println(total);
        }
        sc.close();
    }
}