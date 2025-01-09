import java.util.Scanner;

public class B_Shuffle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int t = sc.nextInt();
          
        while (t-- >0) {
            
            int n = sc.nextInt();
            int x = sc.nextInt();
            int m = sc.nextInt();

            int l=x, r=x;

            for(int i=0; i<m; i++){
                int left = sc.nextInt();
                int right = sc.nextInt();

                
                if(Math.max(left, l) <= Math.min(r, right)){
                       l = Math.min(l, left);
                       r = Math.max(r, right);
                }
            }
            System.out.println(r - l + 1);
        }
        sc.close();
    }
}