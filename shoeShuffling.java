import java.util.*;
public class shoeShuffling{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            Map<Integer,Integer> count = new HashMap<>();

            for(int num: a){
                count.put(num, count.getOrDefault(num,0)+1);
            }
            boolean flag = true;
            for(int num : a){
                if(count.get(num) == 1){
                    flag = false;
                    break;
                }
            }
            if(flag == false){
                System.out.println(-1);
            }
          else{
            int[] ans = new int[n];
            for(int i=0; i<n; i++){
                ans[i] = i+1;
            }
            for(int i=n-1; i>0; i--){
                
                if(a[i] == a[i-1]){
                   int temp = ans[i];
                   ans[i] = ans[i-1];
                   ans[i-1] = temp;
                   
                }
                
            }
            for(int i=0; i<n; i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
    }
}