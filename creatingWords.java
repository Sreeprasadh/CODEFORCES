import java.util.*;
public class creatingWords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
           String a = sc.next();
           String b = sc.next();

           char f = a.charAt(0);
           char l = b.charAt(0);

           StringBuilder newa = new StringBuilder(a);
           newa.setCharAt(0,l);

           StringBuilder newb = new StringBuilder(b);
           newb.setCharAt(0,f);
           
           System.out.println(newa.toString() + " " + newb.toString());

        }
    }
}