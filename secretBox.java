import java.util.*;
public class secretBox{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
           
           long x = sc.nextInt();
           long y = sc.nextInt();
           long z = sc.nextInt();

           long k = sc.nextLong();
            
           long maxcount  = 0;

           for(long a=1; a<=x; a++){

              for(long b=1; b<=y; b++){
                boolean flag1 = false, flag2 = false;
                  if(k % (a*b) ==0){
                    flag1 = true;
                  }
                  long c = (k / (a*b));

                  if(c <= z){
                    flag2 = true;
                  }
                  if(flag1 == true && flag2 == true){
                    long side1 = a;
                    long side2 = b;
                    long side3 = c;

                    long count = (x-side1 + 1);
                    count *= (y - side2 +1);
                    count *= (z - side3 +1);

                    maxcount = Math.max(maxcount, count);
                  }

              }
           }
           System.out.println(maxcount);
        }
    }
}