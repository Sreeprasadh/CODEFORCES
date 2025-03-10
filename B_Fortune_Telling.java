import java.util.*;

public class B_Fortune_Telling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            long y = sc.nextLong();

            int cnt = 0;
            for(int i=0; i<n; i++){
                long num = sc.nextLong();

                if(num%2 == 1){
                    cnt++;
                }
            }

            if(cnt%2 == 1){
                if(x%2 != y%2){
                    System.out.println("Alice ");
                }else{
                    System.out.println("Bob ");
                }
            }else{
                if(x%2 == y%2){
                    System.out.println("Alice ");
                }else{
                    System.out.println("Bob ");
                }
            }
        }
        sc.close();
    }
}