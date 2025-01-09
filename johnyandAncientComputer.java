import java.util.*;
public class johnyandAncientComputer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            
            long a = sc.nextLong();
            long b = sc.nextLong();

            if(a == b){
                System.out.println(0);
                continue;
            }

            if(a>b){
                long temp = a;
                a = b;
                b = temp;
            }

            if(b%a != 0){
                System.out.println(-1);
                continue;
            }
            long n = b/a;
            long cnt = 0;
            while(n % 8 ==0){
               n = n/8;
               cnt++;
            }
            while(n % 4 == 0){
                n = n/4;
                cnt++;
            }
            while(n % 2 == 0){
                n = n/2;
                cnt++;
            }
            if(n != 1){
                System.out.println(-1);
            }
            else{
                System.out.println(cnt);
            }

        }
    }
}