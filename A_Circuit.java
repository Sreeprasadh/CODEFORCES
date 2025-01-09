import java.util.*;

public class A_Circuit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[2*n];

            int on =0, off =0;

            for(int i=0; i<2*n; i++){
                a[i] = sc.nextInt();

                if(a[i] == 1){
                    on++;
                }else{
                    off++;
                }
            }

            if(on%2 == 0){
                System.out.print(0 + " ");
            }else{
                System.out.print(1 + " ");
            }

            if(on <= n){
                System.out.print(on);
            }else{
                int rem = on - n;
                rem = n -rem;

                System.out.print(rem);
            }
            System.out.println();
        }
        
        sc.close();
    }
 
}