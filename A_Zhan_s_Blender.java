import java.util.*;

public class A_Zhan_s_Blender {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
          
          long n = sc.nextLong();
          long x = sc.nextLong();
          long y = sc.nextLong();

          long mini = Math.min(x, y);

          long ans = n/mini;
          long rem = n % mini;
          if (rem > 0) {
            ans++;
          }
          System.out.println(ans);
           
        }
        sc.close();
    }
}