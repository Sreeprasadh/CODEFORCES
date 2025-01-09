import java.util.*;

public class A_Perpendicular_Segments {
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();

            int point = Math.min(x,y);
            System.out.println(0 + " " + 0 + " "+ (point) + " " + (point));
            System.out.println(0 + " " + point + " " + point + " " + 0);
        }
        
        sc.close();
    }
 
}