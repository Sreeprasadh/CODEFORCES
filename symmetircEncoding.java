import java.util.*;
public class symmetircEncoding{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){
          int n = sc.nextInt();
          String b = sc.next();

          

          TreeSet<Character> set = new TreeSet<>();
          for(int i=0; i<n; i++){
            set.add(b.charAt(i));
          }

          StringBuilder sb = new StringBuilder();
          for(char ch : set){
            sb.append(ch);
          }
          int size = sb.length();
          StringBuilder res = new StringBuilder();
          for(int i=0; i<n; i++){
             int pos = sb.indexOf(String.valueOf(b.charAt(i)));
             int newpos = (size - pos) - 1;

             res.append(sb.charAt(newpos));
          }
          System.out.println(res.toString());
        }
    }
}