import java.io.*;
import java.util.*;

public class C_Sort {

    private static class FastReader {
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

        String nextLine() {
            try {
                return br.readLine().trim();
            } catch (IOException e) {
                e.printStackTrace();
                return "";
            }
        }
    }

    private static class FastWriter {
        private final BufferedWriter bw;

        public FastWriter() {
            this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        public void print(Object object) throws IOException {
            bw.write(object.toString());
        }

        public void println(Object object) throws IOException {
            print(object);
            bw.write("\n");
        }

        public void close() throws IOException {
            bw.close();
        }
    }

    private static void findFrequency(int[][] prefix, String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int ind = ch - 'a';
            for (int j = 0; j < 26; j++) {
                prefix[i + 1][j] = prefix[i][j];
            }
            prefix[i + 1][ind]++;
        }
    }

    private static int[] getFrequency(int[][] prefixFreq, int l, int r) {
        int[] freq = new int[26];
        for (int i = 0; i < 26; i++) {
            freq[i] = prefixFreq[r][i] - prefixFreq[l - 1][i];
        }
        return freq;
    }

    private static int minOperations(int[] freqA, int[] freqB) {
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (freqB[i] > freqA[i]) {
                ans += freqB[i] - freqA[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        FastWriter out = new FastWriter();

        try {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int q = sc.nextInt();

                String a = sc.next();
                String b = sc.next();

                int[][] prefixFreqA = new int[n + 1][26];
                int[][] prefixFreqB = new int[n + 1][26];

                findFrequency(prefixFreqA, a);
                findFrequency(prefixFreqB, b);

                for (int i = 0; i < q; i++) {
                    int l = sc.nextInt();
                    int r = sc.nextInt();

                    int[] freqA = getFrequency(prefixFreqA, l, r);
                    int[] freqB = getFrequency(prefixFreqB, l, r);

                    int result = minOperations(freqA, freqB);
                    out.println(result);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
