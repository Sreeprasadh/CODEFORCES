import java.util.*;

public class MexOrMixup {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        int x = 300003;
        int[] arr = new int[300003];

        for(int i=1; i<300003; i++){
            arr[i] = arr[i-1] ^ i;
        }

        while(T-- >0){

            int a = sc.nextInt();
            int b = sc.nextInt();

            if(arr[a-1] == b){
                System.out.println(a);
                continue;
            }
            else if((arr[a-1] ^ b) == a){
                System.out.println(a+2);
                continue;
            }
            else{
                System.out.println(a+1);
                continue;
            }

        }
    }
}