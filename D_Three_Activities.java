import static java.lang.Math.max; //ease of calling
import static java.lang.Math.min; //ease of calling
import static java.lang.Math.abs; //ease of calling
import static java.lang.Math.pow; //ease of calling
import java.io.*;// for input-output
import java.util.*; //for Collections Framework, Arrays.sort, etc
import java.math.*; //for BigInteger Class, etc

public class D_Three_Activities {
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

    private static int[] getLargestThree(long[] arr){

        int mx1 = -1, mx2 = -1, mx3 = -1;

        for(int i=0; i<arr.length; i++){

            if(mx1 == -1 || arr[i] > arr[mx1]){
                mx3 = mx2;
                mx2 = mx1;
                mx1 = i;
            }
            else if(mx2 == -1 || arr[i] > arr[mx2]){
                mx3 = mx2;
                mx2 = i;
            }
            else if(mx3 == -1 || arr[i] > arr[mx3]){
                mx3 = i;
            }
        }

        return new int[]{mx1, mx2, mx3};
    }

    public static void main(String[] args) {
        try {
            FastReader sc = new FastReader();
            FastWriter out = new FastWriter();
            int testCases = sc.nextInt();
            while (testCases-- > 0) {
                // write code here
                int n = sc.nextInt();
                long[] a = new long[n];
                long[] b = new long[n];
                long[] c = new long[n];

                for(int i=0; i<n; i++){
                    a[i] = sc.nextLong();
                }
                for(int i=0; i<n; i++){
                    b[i] = sc.nextLong();
                }
                for(int i=0; i<n; i++){
                    c[i] = sc.nextLong();
                }

                int[] largeThreeA = getLargestThree(a);
                int[] largeThreeB = getLargestThree(b);
                int[] largeThreeC = getLargestThree(c);

                long ans = 0;
                for(int x : largeThreeA){
                    for(int y : largeThreeB){
                        for(int z : largeThreeC){
                            if(x != y && y != z && x != z){
                                ans = Math.max(ans, a[x]+b[y]+c[z]);
                            }
                        }
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