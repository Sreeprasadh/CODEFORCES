import java.util.*;
public class differentString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            String s = sc.next();
            boolean flag = true;
            int ind =1;
            int l = s.length();
            for(int i=0; i<l-1; i++){
                if(s.charAt(i) != s.charAt(i+1)){
                   flag = false;
                   ind = i+1;
                   break;
                }
            }
            if(flag == true){
                System.out.println("NO ");
            }
            else{
                StringBuilder sb = new StringBuilder(s);
                char c = sb.charAt(0);
                sb.setCharAt(0,sb.charAt(ind));
                sb.setCharAt(ind, c);
                System.out.println("YES ");
                System.out.println(sb.toString());
            }

        }
    }
}