import java.util.*;
public class addandDivide{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int ans = 40;
            
            for(int i=0; i<32; i++){
                
                if(b + i ==1) continue;
                int cnt =0, temp =a;
               
                while(temp != 0){
                    
                    cnt++;
                    temp = temp/(b+i);
                }
                ans= Math.min(ans, i+cnt);
                
            }
            System.out.println(ans);
        }
    }
}