import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_Dora_s_Set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int l= sc.nextInt();
            int r = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            for(int i=l; i<=r; i++){
                list.add(i);
            }
            int n = list.size();

            int cnt = 0;

            for(int i=0; i<n;){
                if ((i+1) < n-1 && (i+2) < n && list.get(i)%2==1 && list.get(i+1)%2==0 && list.get(i+2)%2==1){
                    cnt++;
                    i+=3;
                }else{i++;}
            }
            System.out.println(cnt);
        }

        sc.close();
    }
}