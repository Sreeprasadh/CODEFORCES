import java.util.Scanner;

public class B_Omkar_and_Last_Class_of_Math {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int t = sc.nextInt();
          
        while (t-- >0) {
            
            int n = sc.nextInt();

            if(n%2 == 0){
                System.out.print((n/2) + " " + (n/2));
                System.out.println();
            }else{
                
                boolean non = false;
                int s = -1;
                for(int i=2; i*i <=n; i++){
                    if(n%i == 0){
                        non = true;
                        s = i;
                        break;
                    }
                }
                if(non){
                    System.out.print((n/s) + " " + (n-(n/s)));
                    System.out.println();
                }else{   
                    System.out.print(1 + " " + (n-1));
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}