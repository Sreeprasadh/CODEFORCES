import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_WOW_Factor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        long a = 0, b=0, c=0;
        int n = s.length();

        for(int i=0; i<n; i++){
            if(s.charAt(i) == 'o'){
                b += a;
            }else if(i>0 && s.charAt(i-1) == s.charAt(i)){
                a++;
                c += b;
            }
        }
        System.out.println(c);
        sc.close();
    }
}