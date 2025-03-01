import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.*;
import java.util.Set;

public class B_Average_Sleep_Time {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        long sum = 0;

        for(int i=0; i<k; i++){
            sum += a[i];
        }
        long totalsum = sum;

        for(int i=1; i<=n-k; i++){
            sum -= a[i-1];
            sum += a[i+k-1];
            totalsum += sum;
        }
        double avg = (double) totalsum/(n-k+1);
        System.out.printf("%.10f%n" , avg);
    }
}