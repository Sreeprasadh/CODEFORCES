import java.util.Scanner;

public class B_Move_and_Turn {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
          
        int dots = 0, lines = 0;
        long ans = 0;

        if(n%2 == 1){
            dots = 1;

            for(int i=1; i<=n; i+=2){
                dots++;
                lines++;
            }
            ans = dots*lines*2;
        }else{
            dots = 1;
            lines = 1;
            for(int i=2; i<=n; i+=2){
                dots++;
                lines++;
            }
            ans = dots*lines;
        }
        System.out.println(ans);
        sc.close();
    }
}