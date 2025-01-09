import java.util.*;

public class Xaxis {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            int mindis = 20;

            int f = Math.abs(a - a) + Math.abs(a - b) + Math.abs(a - c);
            int s = Math.abs(b - a) + Math.abs(b - b) + Math.abs(b - c);
            int t = Math.abs(c - a) + Math.abs(c - b) + Math.abs(c - c);

            mindis = Math.min(f, Math.min(s, t));
            System.out.println(mindis);

        }
    }
}