import java.util.*;

public class D_Find_the_Different_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
           int n = sc.nextInt();
        
           int[] a = new int[n];

           for(int i=0; i<n; i++){
              a[i] = sc.nextInt();
           }

           List<Integer> diff = new ArrayList<>();
           for(int i=0; i<n-1; i++){
                if(a[i] != a[i+1]){
                    diff.add(i);
                }
           }

           int q = sc.nextInt();

           while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();

                l--;
                r--;

                int lb = findLowerBound(l, diff);

                if (lb < diff.size() && diff.get(lb)< r) {
                    System.out.println((diff.get(lb)+1) +" " + (diff.get(lb)+2));
                }else{
                    System.out.println(-1 + " " + -1);
                }
           }
        }

        sc.close();
    }

    private static int findLowerBound(int target, List<Integer> diff){

        int l = 0, h = diff.size()-1;
        
        while (l <= h) {
            int mid = (l+h)/2;

            if(diff.get(mid) < target){
                l = mid +1;
            }else{
                h = mid -1;
            }
        }

        return l;
    }

}