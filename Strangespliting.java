import java.util.*;
public class Strangespliting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){

            int n= sc.nextInt();
            int[] a = new int[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();

            }

            int cnt = 0;
            for(int i=0; i<n-1; i++){
               if(a[i] == a[i+1]){
                cnt ++;
               }
            }
            if(cnt == n-1){
                System.out.println("NO ");
            }
            else{
                int find = -1;
                for(int i=1; i<n-1; i++){
                    if(a[i-1] != a[i+1]){
                       find = i;
                       break;
                    }
                }
                char[] ans = new char[n];
                for(int i=0; i<n; i++){
                    if(i == find){
                        ans[i] = 'R';
                    }
                    else{
                        ans[i] = 'B';
                    }
                }
                String str = new String(ans);
                System.out.println("YES ");
                System.out.println(str);
            }


        }
    }
}
