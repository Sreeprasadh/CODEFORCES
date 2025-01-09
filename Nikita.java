import java.util.*;
public class Nikita{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){

            int n = sc.nextInt();
            int m = sc.nextInt();

            if(n == m){
                System.out.println("Yes ");
            }
            else if(n % 2 ==0 && m % 2 == 0 && n >=m){
                System.out.println("Yes ");
            }
            else if(n % 2 ==1 && m %2 == 1 && n>=m){
                System.out.println("Yes ");
            }
            else{
                
                System.out.println("No ");
            }
        }
    }
}