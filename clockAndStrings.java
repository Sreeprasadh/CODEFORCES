import java.util.*;
public class clockAndStrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int cnt =0;
            int mini = Math.min(a,b);
            int maxi = Math.max(a,b);
            for(int i=mini; i<=maxi; i++){
                if(i == c){
                    cnt++;
                }
                else if(i == d){
                    cnt++;
                }
            }
            if(cnt == 1){
                System.out.println("YES ");
            }
            else{
                System.out.println("NO ");
            }

        }
    }
}