import java.util.*;
public class buyingTorches{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();

            long sticks = k * y;
            sticks += k;

            long trades =  (sticks -1) / (x -1);
            
            long rem = (sticks -1) % (x-1);
            if(rem != 0){
                trades ++;
            }
            
            trades += k;
            System.out.println(trades);

        }
    }
}