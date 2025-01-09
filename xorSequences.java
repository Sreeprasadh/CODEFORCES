import java.util.*;
public class xorSequences{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){

            long x = sc.nextLong();
            long y = sc.nextLong();
            
            
            for(int bit=0; bit<=30; bit++){
                if(((x >> bit) & 1) != ((y >> bit) & 1) ){
                   System.out.println(1L << bit);
                   break;
                }
            }
            continue;
        }
    }
}