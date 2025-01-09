import java.util.*;
import java.io.*;
public class newArraymerging{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- >0){
            int n = nextInt();
            int [] a = new int[n];
            int [] b = new int[n];
            for(int i=0; i<n; i++){
                a[i] = nextInt();
            }
            for(int i=0; i<n; i++){
                b[i] = nextInt();
            }
           
           
            int[] c1 = new int[(2*n)+1];
            int[] c2 = new int[(2*n)+1];
            int current =1;

            for(int i=0; i<n-1; i++){
                if(a[i] == a[i+1]){
                    current++;
                }
                else{
                    c1[a[i]] = Math.max(c1[a[i]], current);
                    current =1;
                }
                
            }
            c1[a[n-1]] = Math.max(c1[a[n-1]], current);
            current =1;

            for(int i=0; i<n-1; i++){
                if(b[i] == b[i+1]){
                    current++;
                }
                else{
                    c2[b[i]] = Math.max(c2[b[i]], current); 
                    current = 1;
                }
                
            }
            c2[b[n-1]] = Math.max(c2[b[n-1]], current);

            int ans =0;
            for(int i: a){
              ans = Math.max(ans, c1[i] + c2[i]);
            }
            for(int i : b){
                ans = Math.max(ans, c1[i]+ c2[i]);
            }
            System.out.println(ans);
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