import static java.lang.Math.max; //ease of calling
import static java.lang.Math.min; //ease of calling
import static java.lang.Math.abs; //ease of calling
import static java.lang.Math.pow; //ease of calling
import java.io.*;// for input-output
import java.util.*; //for Collections Framework, Arrays.sort, etc
import java.math.*; //for BigInteger Class, etc

public class B_Subtract_Operation {
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
               long[] a = new long[n];

               for(int i=0; i<n; i++){
                  a[i] = sc.nextLong();
               }

               Arrays.sort(a);
               int i=0, j= 1;
               boolean flag = false;
               while (i < n && j < n) {
                    
                   if(a[i] + Math.abs(k) == a[j]){
                        flag = true;
                        break;
                   }
                   else if(a[i] + Math.abs(k) > a[j]){
                       j++;
                   }
                   else{
                      i++;
                   }
               }
               if ((flag)) {
                 System.out.println("YES ");
               }
               else{
                  System.out.println("NO ");
               }
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}