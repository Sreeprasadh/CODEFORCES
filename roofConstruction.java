import java.util.*;

public class roofConstruction {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            
            int m = n-1;

            int nbits = 0;
            while(m > 0){
                nbits ++;
                m/=2;
            }
            int lsbit = 1;
            nbits--;

            while(nbits > 0){
                lsbit = lsbit * 2;
                nbits --;
            }
            for(int i=n-1; i>=lsbit; i--){
                System.out.print(i + " ");
            }
            for(int i=0; i< lsbit; i++){
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }
}