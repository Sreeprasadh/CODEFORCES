import java.util.*;

public class arrayMerging2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            int maxLen = 0;
            for (int i = 0; i < n; i++) {
                int[] c = new int[2 * n];
                System.arraycopy(a, 0, c, 0, i + 1);
                System.arraycopy(b, 0, c, i + 1, n - i);
                int len = maxLengthOfEqualSubarray(c);
                maxLen = Math.max(maxLen, len);
            }
            System.out.println(maxLen);
        }
    }

    private static int maxLengthOfEqualSubarray(int[] arr) {
        int maxLen = 0;
        int len = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                len++;
            } else {
                maxLen = Math.max(maxLen, len);
                len = 1;
            }
        }
        maxLen = Math.max(maxLen, len);
        return maxLen;
    }
}
