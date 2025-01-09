import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class C_Longest_Good_Array {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String[] input = br.readLine().trim().split(" ");
            long l = Long.parseLong(input[0]);
            long r = Long.parseLong(input[1]);

            if (l == r) {
                bw.write("1\n");
            } else {
                long cnt = 0;
                long i = l;
                long diff = 1;

                while (i <= r) {
                    cnt++;
                    i = i + diff;
                    diff++;
                }
                bw.write(cnt + "\n");
            }
        }

        br.close();
        bw.close();
    }
}
