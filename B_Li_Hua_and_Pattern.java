import static java.lang.Math.max; //ease of calling
import static java.lang.Math.min; //ease of calling
import static java.lang.Math.abs; //ease of calling
import static java.lang.Math.pow; //ease of calling
import java.io.*;// for input-output
import java.util.*; //for Collections Framework, Arrays.sort, etc
import java.math.*; //for BigInteger Class, etc

public class B_Li_Hua_and_Pattern {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.append("" + object);
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.append("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    public static void main(String[] args) {
        try {
            FastReader sc = new FastReader();
            FastWriter out = new FastWriter();
            int testCases = sc.nextInt();
            while (testCases-- > 0) {
                // write code here
            int n = sc.nextInt();
            long k = sc.nextLong();
 
            int[][] a = new int[n][n];
 
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    a[i][j] = sc.nextInt();
                }
            }
 
 
            int diff = 0;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
 
                    if(a[i][j] != a[n-1-i][n-1-j]){
                        diff++;
                    }
                }
            }
            
            diff/=2;
            if(diff > k){
                System.out.println("NO ");
            }
            else{
 
                k -= diff;
                if(n%2 ==1){
                    System.out.println("YES ");
                }
                else if(k%2 == 1){
                    System.out.println("NO ");
                }
                else{
                    System.out.println("YES ");
                }
            }

            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}