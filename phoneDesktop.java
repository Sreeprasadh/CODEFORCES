import java.util.*;
public class phoneDesktop{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){

           int x = sc.nextInt();
           int y = sc.nextInt();

           if(x==0 && y==0){
            System.out.println(0);
            continue;
           }
           else if((y*4) <= 8 && (x*1) <=7){
            System.out.println(1);
           }
           else if(y%2 ==0){
            int screens = y/2;
            int remcells = (screens * 15) - (y*4);
            if(remcells >= x){
                System.out.println(screens);
            }
            else{
                int addcells = x - remcells;
                
                int addscreens = (int)Math.ceil((double)addcells/15);
                System.out.println(screens + addscreens);
               
            }
           }
           else if(y%2 !=0){
            int screens = (y/2)+1;
            int remcells = (screens * 15) - (y*4);
            if(remcells >= x){
                System.out.println(screens);
            }
            else{
                int addcells = x - remcells;
                
                int addscreens = (int)Math.ceil((double)addcells/15);
                System.out.println(screens + addscreens);
            }
           }
        }
    
    
    }
}