import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class B_Index_and_Maximum_Value {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String[] firstLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int m = Integer.parseInt(firstLine[1]);

            long[] a = new long[n];
            long maxi = Long.MIN_VALUE;

            String[] arrayElements = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(arrayElements[i]);
                maxi = Math.max(maxi, a[i]);
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < m; i++) {
                String[] operation = br.readLine().trim().split(" ");
                char ch = operation[0].charAt(0);
                long l = Long.parseLong(operation[1]);
                long r = Long.parseLong(operation[2]);

                if (l <= maxi && maxi <= r) {
                    if (ch == '+') {
                        maxi = maxi + 1;
                    } else {
                        maxi = maxi - 1;
                    }
                }

                sb.append(maxi).append(" ");
            }
            sb.append("\n");
            bw.write(sb.toString());
        }

        br.close();
        bw.close();
    }
}
