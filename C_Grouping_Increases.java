import java.util.*;

public class C_Grouping_Increases {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- >0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            int s1 = Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;
            int minpenalty = 0;

            for(int i=0; i<n; i++){

                if(s1 > s2){
                    int temp = s1;
                    s1 = s2;
                    s2 = temp;
                }

                if(a[i] <= s1){
                    s1 = a[i];
                }else if(a[i] <= s2){
                    s2 = a[i];
                }else{
                    minpenalty++;
                    s1 = a[i];
                }
            }
            System.out.println(minpenalty);
        }
       
    }
}