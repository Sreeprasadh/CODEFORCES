import java.util.*;
public class largeAddition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){

            String s = sc.next();
            boolean flag = true;
            if(s.charAt(0) != '1'){
                System.out.println("NO ");
                continue;
            }
            if(s.charAt(s.length()-1) == '9'){
                System.out.println("NO ");
                continue;
            }
            for(int i=1; i<s.length()-1; i++){
                if(s.charAt(i) == '0'){
                    System.out.println("NO ");
                    flag = false;
                    break;
                }
            }
       
           if(flag){
            System.out.println("YES ");
            continue;
           } 
        }
    }
}