import static java.lang.Math.max; //ease of calling
import static java.lang.Math.min; //ease of calling
import static java.lang.Math.abs; //ease of calling
import static java.lang.Math.pow; //ease of calling
import java.io.*;// for input-output
import java.util.*; //for Collections Framework, Arrays.sort, etc
import java.math.*; //for BigInteger Class, etc

public class B_GCD_Partition {
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

    private static long gcd(long a, long b){

        while (b!=0) {
            long temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        try {
            FastReader sc = new FastReader();
            FastWriter out = new FastWriter();
            int testCases = sc.nextInt();
            while (testCases-- > 0) {
                // write code here
                int n  = sc.nextInt();

                long[] a = new long[n];

                for(int i=0; i<n; i++){
                    a[i] = sc.nextLong();
                }

                long[] prefix = new long[n];
                long[] suffix = new long[n];

                prefix[0] = a[0];
                suffix[n-1] = a[n-1];

                for(int i=1; i<n; i++){
 
                    prefix[i] = prefix[i-1] + a[i];
                }
                for(int i=n-2; i>=0; i--){
 
                    suffix[i] = suffix[i+1] + a[i];
                }

                long ans = 1;

                for(int i=0; i<n-1; i++){
                    ans = Math.max(ans, gcd(prefix[i], suffix[i+1]));
                }
                System.out.println(ans);
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}