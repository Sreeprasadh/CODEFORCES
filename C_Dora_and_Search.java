import java.util.*;

public class C_Dora_and_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            int l =0, r = n-1;

            int mn = 1, mx = n;

            while (l <= r) {
                
                if(a[l] == mn){
                    l++;
                    mn++;
                }
                else if(a[l] == mx){
                    l++;
                    mx--;
                }
                else if(a[r] == mn){
                    r--;
                    mn++;
                }
                else if(a[r] == mx){
                    r--;
                    mx--;
                }
                else{
                    break;
                }
            }

            if(l<=r){
                System.out.print((l+1) + " ");
                System.out.print(r+1);
                System.out.println();
            }
            else{
                System.out.println(-1);
            }
        }

        sc.close();
    }
}