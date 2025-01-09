import java.util.*;
public class Ingenuity{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            String s = sc.next();

            int x=0, y=0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == 'N'){
                    x ++;
                }
                else if(s.charAt(i) == 'S'){
                    x--;
                }
                else if(s.charAt(i) == 'E'){
                    y++;
                }
                else if(s.charAt(i) == 'W'){
                    y--;
                }
            }
            if(Math.abs(x%2) !=0 || Math.abs(y%2) !=0){
                System.out.println("NO ");
            }
            else if(n == 2 && x ==0 && y == 0){
                System.out.println("NO ");
            }
            else{
                
                StringBuilder sb = new StringBuilder(n);
                int a =0, b =0, c =1, d =1;
                char[] who = {'R', 'H'};
                for(int i=0; i<n; i++){
                    if(s.charAt(i) == 'N'){
                       sb.append(who[a]);
                       a = 1 - a;
                    }
                    else if(s.charAt(i) == 'S'){
                        sb.append(who[b]);
                        b = 1 - b;
                    }
                    else if(s.charAt(i) == 'E'){
                        sb.append(who[c]);
                        c = 1 - c;
                    }
                    else{
                        sb.append(who[d]);
                        d = 1 - d;
                    }
                }
                System.out.println(sb.toString());
            }
        }
    }
}