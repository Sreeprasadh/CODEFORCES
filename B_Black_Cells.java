import java.io.*;
import java.util.*;

public class B_Black_Cells {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long[] a = new long[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(st.nextToken());
            }

            if(n == 1) {
                bw.write("1\n");
                continue;
            }

            long low = 1, high = (long)1e18;
            long k = 1;

            while (low <= high) {
                long mid = (low + high)/2;

                if(isPossible(mid, a)){
                    k = mid;
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            System.out.println(k);
        }
        
        br.close();
        bw.flush();
        bw.close();
    }

    private static boolean isPossible(long target, long[] a) {
        int len = a.length;
        int exclude = 0;

        

        for(int i=0; i<len; i++){
           
            if(i==len-1){
                break;
            }
           long diff = a[i+1] - a[i];
           if(diff > target){
                exclude++;
                if(exclude >= 2){
                    return false;
                }
            }
        }
        return true;
    }
}





