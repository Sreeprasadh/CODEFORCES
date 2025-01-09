import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C_Grandma_Capa_Knits_a_Scarf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int res = Integer.MAX_VALUE;

            for(int i=0; i<26; i++){
                char ch = (char)('a'+i);
                boolean f = true;

                int cnt = 0;
                int l=0, r = n-1;
                while (l < r) {
                    if (s.charAt(l) == s.charAt(r)) {
                        l++;
                        r--;
                    }
                    else if(s.charAt(l) == ch){
                        cnt++;
                        l++;
                    }
                    else if(s.charAt(r) == ch){
                        cnt++;
                        r--;
                    }
                    else{
                        f = false;
                        break;
                    }
                }

                if (f) {
                    res = Math.min(res, cnt);
                }
                
            }
            if(res == Integer.MAX_VALUE){
                System.out.println(-1);
            }else{
                System.out.println(res);
            }
        }

        sc.close();
    }
}