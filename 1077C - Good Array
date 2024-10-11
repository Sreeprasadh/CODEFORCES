import java.io.*;
import java.util.*;

public class C_Good_Array {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        
        int[] a = new int[n];
        int[] count = new int[1000001];
        long sum = 0;

        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(input[i]);
            count[a[i]]++;
            sum += a[i];
        }

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            sum -= a[i];
            count[a[i]]--;

            if(sum%2 == 0 && sum/2<=1000000 && count[(int)sum/2] > 0){
                list.add(i+1);
            }

            sum += a[i];
            count[a[i]]++;
        }

        System.out.println(list.size());
        for(int ind : list){
            System.out.print(ind + " ");
        }
        System.out.println();
    }
}
