import java.util.Arrays;
import java.util.Scanner;

public class C_Make_Them_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            char ch = sc.next().charAt(0);

            String s = sc.next();

            int lastInd = -1;
            boolean flag = true;

            for(int i=0; i<n; i++){
                if(s.charAt(i) == ch){
                    lastInd = i;
                }

                if (s.charAt(i) != ch) {
                    flag = false;
                }
            }

            if(flag){
                System.out.println(0);
            }else if(lastInd == -1){
                System.out.println(2);
                System.out.println((n-1) + " " + (n));
            }else if((lastInd+1) > (n/2)){
                System.out.println(1);
                System.out.println(lastInd+1);
            }else{
                System.out.println(2);
                System.out.println((n-1) + " " + (n));
            }
        
        }

        sc.close();
    }
}