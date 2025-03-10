import java.util.Scanner;

public class A_Array_Elimination {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            int[] count = new int[32];

            for(int i=0; i<n;i++){
                a[i] = sc.nextLong();

                for(int j=0; j<32; j++){
                    if((a[i] & (1 << j)) != 0){
                        count[j]++;
                    }
                }
            }

            for(int i=1; i<=n; i++){

                boolean ok = true;

                for(int j=0; j<32; j++){
                    if(count[j]%i != 0){
                        ok = false;
                        break;
                    }
                }

                if(ok){
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}