import java.util.*;
public class binaryCut{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
          String s = sc.next();
          int l = s.length();
          int cnt =1;
          
          for(int i=1; i<l; i++){
            if(s.charAt(i) != s.charAt(i-1)){
                cnt++;
            }
          }
          if(cnt ==1){
            System.out.println(1);
          }
          else if(cnt ==2 && s.charAt(0) == '1'){
            System.out.println(cnt);
          }
          else{
            System.out.println(cnt -1);
          }
        }
    }
}
