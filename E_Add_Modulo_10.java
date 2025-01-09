import java.util.*;

public class E_Add_Modulo_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] c = new int[2];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();

                if(a[i]%10 == 0){
                    c[0]++;
                }else if(a[i]%10 == 5){
                    c[0]++;

                    a[i] = a[i]+5;
                }else{
                    c[1]++;

                    while (a[i]%10 != 2) {
                        a[i] = a[i] + (a[i]%10);
                    }
                }
            }

            if(c[0] == n){
                Arrays.sort(a);

                if(a[0]==a[n-1]){
                    System.out.println("Yes ");
                }else{
                    System.out.println("No ");
                }
            }else{
                Arrays.sort(a);
                boolean flag = true;

                for(int i=1; i<n; i++){
                    if((a[i] - a[i-1])%20 != 0){
                        flag = false;
                        break;
                    }
                }

                if(flag){
                    System.out.println("Yes ");
                }else{
                    System.out.println("No ");
                }
            }
        }
        
        sc.close();
    }
 
}