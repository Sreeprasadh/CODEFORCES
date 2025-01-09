import java.io.*;
import java.util.*;

public class GoodArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        
        int[] a = new int[n];
        int[] cnt = new int[1000001];  // Replace HashMap with a large array
        long sum = 0;
        
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(input[i]);
            cnt[a[i]]++;
            sum += a[i];
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            sum -= a[i];
            cnt[a[i]]--;
            
            if (sum % 2 == 0 && sum / 2 <= 1000000 && cnt[(int)(sum / 2)] > 0) {
                ans.add(i + 1);  // Add 1 to index for 1-based indexing
            }
            
            sum += a[i];
            cnt[a[i]]++;
        }
        
        System.out.println(ans.size());
        for (int idx : ans) {
            System.out.print(idx + " ");
        }
    }
}

