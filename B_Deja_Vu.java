import java.util.*;

public class B_Deja_Vu {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- >0){
            int n = sc.nextInt();
            int q = sc.nextInt();

            long[] a = new long[n];
            int[] b = new int[q];
            
            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }
            for(int i=0; i<q; i++){
                b[i] = sc.nextInt();
            }

            Set<Integer> st = new HashSet<>();

            for(int i=0; i<q; i++){
                   if (st.contains(b[i])) {
                      continue;
                   }
                   st.add(b[i]);
                   for(int j=0; j<n; j++){
                        if (a[j] % (1 << b[i]) == 0) {
                           a[j] += (1 << (b[i]-1));
                        }
                    }
                  
            }
            for(int i=0; i<n; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}
