import static java.lang.Math.max; //ease of calling
import static java.lang.Math.min; //ease of calling
import static java.lang.Math.abs; //ease of calling
import static java.lang.Math.pow; //ease of calling
import java.io.*;// for input-output
import java.util.*; //for Collections Framework, Arrays.sort, etc
import java.math.*; //for BigInteger Class, etc

public class B_Kalindrome_Array {
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
    static boolean flag;

    private static void check(int x, int[] a, int n){
        ArrayList<Integer> b = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(a[i] != x){
               b.add(a[i]);
            }
        }
        
        int size = b.size();
        for(int i=0; i<size/2; i++){
            if(b.get(i) != b.get(size-i-1)){
                return;
            }
        }
        flag = true;
    }

    public static void main(String[] args) {
        try {
            FastReader sc = new FastReader();
            FastWriter out = new FastWriter();
            int testCases = sc.nextInt();
            while (testCases-- > 0) {
               int n = sc.nextInt();
               int[] a = new int[n];

               for(int i=0; i<n; i++){
                   a[i] = sc.nextInt();
               }
               
               flag = true;
               for(int i=0; i<n; i++){
                  if(a[i] != a[n-i-1]){
                      flag = false;
                      check(a[i], a, n);
                      check(a[n-i-1], a, n);
                      break;
                  }
               }
               if (flag) {
                 System.out.println("YES ");
               }
               else{
                System.out.println("NO  ");
               }

            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}