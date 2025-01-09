import java.util.*;
import java.io.*;

public class arrayMerging {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = nextInt();
        for (int tcase = 1; tcase <= t; tcase++) {
            int n = nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = nextInt();
            }
            Map<Integer, Integer> ans1 = new HashMap<>();
            Map<Integer, Integer> ans2 = new HashMap<>();
            int cnt = 1;
            int mx = -1;
            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1]) {
                    cnt++;
                } else {
                    ans1.put(a[i - 1], Math.max(ans1.getOrDefault(a[i - 1], 0), cnt));
                    mx = Math.max(mx, ans1.get(a[i - 1]));
                    cnt = 1;
                }
            }
            ans1.put(a[n - 1], Math.max(ans1.getOrDefault(a[n - 1], 0), cnt));
            mx = Math.max(ans1.get(a[n - 1]), mx);
            cnt = 1;
            for (int i = 1; i < n; i++) {
                if (b[i] == b[i - 1]) {
                    cnt++;
                } else {
                    ans2.put(b[i - 1], Math.max(ans2.getOrDefault(b[i - 1], 0), cnt));
                    mx = Math.max(mx, ans2.get(b[i - 1]));
                    mx = Math.max(mx, ans1.getOrDefault(b[i - 1], 0) + ans2.getOrDefault(b[i - 1], 0));
                    cnt = 1;
                }
            }
            ans2.put(b[n - 1], Math.max(ans2.getOrDefault(b[n - 1], 0), cnt));
            mx = Math.max(ans2.get(b[n - 1]), mx);
            mx = Math.max(mx, ans1.getOrDefault(b[n - 1], 0) + ans2.getOrDefault(b[n - 1], 0));
            System.out.println(mx);
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
