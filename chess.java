import java.util.*;
public class chess{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){

            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int p3 = sc.nextInt();
            
            int totalpoints = p1 + p2 + p3;
            if(totalpoints % 2 !=0){
                System.out.println(-1);
            }
            else{
                int maxpoint = p3;
                

                int totalgames = totalpoints/2;
                if(totalgames >= maxpoint){
                    System.out.println(totalgames);
                }
                else{
                    System.out.println(p1 + p2);
                }
            }
        }
    }
}