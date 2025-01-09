import java.util.*;

public class B_250_Thousand_Tons_of_TNT {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
       
        while(T-- > 0){
           int n = sc.nextInt();
           int[] a = new int[n];
           
           ArrayList<Long> pre = new ArrayList<>();
           pre.add((long) 0);
           long sum =0;
           for(int i=0; i<n; i++){
              a[i] = sc.nextInt();
              sum += a[i];

              pre.add(sum);
           }
           long res = -1;

           for(int i=1; i<=n; i++){
              List<Long> list = new ArrayList<>();
              if(n%i == 0){
                  
                  for(int j=i; j<=n; j+=i){
                     
                     long wt = pre.get(j) - pre.get(j-(i));
                     list.add(wt);
                  }
              
                Collections.sort(list);
                res = Math.max(res, list.get(list.size()-1) - list.get(0));
              }
           }
           
           System.out.println(res);
        }
    }
}