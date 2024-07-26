import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class B_2_D_Traveling {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            long[] x = new long[n + 1];
            long[] y = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                st = new StringTokenizer(br.readLine());
                x[i] = Long.parseLong(st.nextToken());
                y[i] = Long.parseLong(st.nextToken());
            }

            long price_a = Long.MAX_VALUE / 2;
            long price_b = Long.MAX_VALUE / 2;

            long normalPrice = Math.abs(x[a] - x[b]) + Math.abs(y[a] - y[b]);

            for (int mcity = 1; mcity <= k; mcity++) {
                long dist_a_mcity = Math.abs(x[a] - x[mcity]) + Math.abs(y[a] - y[mcity]);
                long dist_b_mcity = Math.abs(x[b] - x[mcity]) + Math.abs(y[b] - y[mcity]);

                price_a = Math.min(price_a, dist_a_mcity);
                price_b = Math.min(price_b, dist_b_mcity);
            }

            bw.write(String.valueOf(Math.min(normalPrice, price_a + price_b)) + "\n");
        }

        br.close();
        bw.close();
    }
}
