import java.util.Arrays;
import java.util.Scanner;

public class D_Slavic_s_Exam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        while (testCases-- > 0) {
            String s = sc.nextLine().trim();
            String t = sc.nextLine().trim();

            int n =s.length();
            int m = t.length();

            StringBuilder sb = new StringBuilder(s);
            int i=0, j= 0;
            while (i<n && j < m) {
                
                if(s.charAt(i) == t.charAt(j)){
                    i++;
                    j++;
                }
                else if(s.charAt(i) != t.charAt(j) && s.charAt(i) == '?'){
                    sb.setCharAt(i, t.charAt(j));
                    i++;
                    j++;
                }
                else{
                    i++;
                }
            }

            if (j < m) {
                System.out.println("No ");
                continue;
            }
            else{
                while (i < n) {
                    if (s.charAt(i) == '?') {
                        sb.setCharAt(i, 'a');
                    }
                    i++;
                }
                System.out.println("YES ");
                System.out.println(sb.toString());
            }
           
        }
        
        sc.close();
    }
}