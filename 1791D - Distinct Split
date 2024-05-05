import java.util.*;
import java.io.*;
public class distinctSplit{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- >0){
          int n = nextInt();
          String s= next();
          Set<Character> set = new HashSet<>();
          int[] pre = new int[n];
          int[] suf = new int[n];

          for(int i=0; i<n; i++){
            set.add(s.charAt(i));
            pre[i] = set.size();
          }
          set.clear();
          for(int i=n-1; i>=0 ;i--){
            set.add(s.charAt(i));
            suf[i] = set.size();
          }
          int ans =0, maxi=0;
          for(int i=0; i< n-1; i++){
            ans = pre[i] + suf[i+1];
            maxi = Math.max(maxi, ans);
          }
          System.out.println(maxi);
        }
    }
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}
