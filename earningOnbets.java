import java.util.*;
public class earningOnbets{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
          
            int n = sc.nextInt();

            int[] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            long lcm =a[0];
            for(int i=1; i<n; i++){
                lcm = findLcm(lcm, a[i]);
            }

            ArrayList<Integer> list = new ArrayList<>();
            long betsum =0;
            int bet =0;
            for(int i=0; i<n; i++){
                bet = (int)lcm/a[i];
                list.add(bet);
                betsum += bet;
            }
            if(betsum < lcm){
                for(int i=0; i<n; i++){
                    System.out.print(list.get(i) + " ");
                }
                System.out.println();
            }
            else{
                System.out.println(-1);
            }
        }
    }
    private static long findLcm(long a, long b){
        return (a*b)/gcd(a,b);
    }
    private static long gcd(long a, long b){
        while(b!=0){
            long temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
  
}
