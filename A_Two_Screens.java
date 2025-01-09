import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class A_Two_Screens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(); 
          
        while (q-- > 0) {
           String s = sc.next();
           String t = sc.next();

           if(s.charAt(0) != t.charAt(0)){
              System.out.println(s.length()+t.length());
           }else{
                int steps = 0;

                int len1 = s.length();
                int len2 = t.length();

                int i=0, j=0;

                while(i < len1 && j <len2){
                    if(s.charAt(i) != t.charAt(j)){
                        break;
                    }
                    i++;
                    j++;
                }

                steps += i;
                steps++;
                if(i <len1){
                    steps+= len1-i;
                }
                if(j < len2){
                    steps+= len2-j;
                }

                System.out.println(steps);
           }
        }
        sc.close();
    }
}