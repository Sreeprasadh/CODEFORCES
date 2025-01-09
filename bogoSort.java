import java.util.*;
public class bogoSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            int[] a = new int[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();

            }

            Arrays.sort(a);
            int i=0, j = n-1;
            while(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++; 
                j--;
            }
            for(int k=0; k<n; k++){
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }
    }
}