import java.util.*;
public class verifyPassword{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- >0){

            int n = sc.nextInt();
            String s = sc.next();
             
            boolean flag = true;

            for(int i=0; i<n-1; i++){
               
               if(Character.isLetter(s.charAt(i)) && Character.isDigit(s.charAt(i+1))){
                flag = false;
                break;
               }
               else if(Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i+1))){
                 if(s.charAt(i) - '0' > s.charAt(i+1)- '0'){
                    flag = false;
                    break;
                 }
               }
              else if(Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(i+1))){
                 if(s.charAt(i) - '0' > s.charAt(i+1) - '0'){
                    flag = false;
                    break;
                 }
              }
           
            }
            if(flag){
                System.out.println("YES ");
            }
            else{
                System.out.println("NO ");
            }
    }
}
}