import java.util.*;

public class EraseFirstOrSecond {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
       
        while(T-- > 0){
           int n = sc.nextInt();
           String s = sc.next();

           int[] f = new int[26];
           long ans = 0;

           for(int i=0; i<n; i++){

              if(f[s.charAt(i) - 'a'] ==0){
                 ans += (n-i);
                 f[s.charAt(i) - 'a'] = 1;
              }
           }
           System.out.println(ans);
           
        }
    }
}