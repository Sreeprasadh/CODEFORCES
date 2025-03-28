import java.util.*;

public class C_Array_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            // If k >= 3, the answer is always 0
            if (k >= 3) {
                System.out.println(0);
                continue;
            }

            Arrays.sort(a);

            // For k == 1, the minimum difference between any two elements
            long d = a[0];
            for (int i = 0; i < n - 1; i++) {
                d = Math.min(d, a[i + 1] - a[i]);
            }

            if (k == 1) {
                System.out.println(d);
                continue;
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    long v = a[i] - a[j];
                    
                    // Finding the lower bound for v
                    int pos = lowerBound(a, v);
                    
                    
                    // Check the value at the found position
                    if (pos < n) {
                        d = Math.min(d, Math.abs(a[pos] - v));
                    }
                    // Check the previous value
                    if (pos > 0) {
                        d = Math.min(d, Math.abs(v - a[pos - 1]));
                    }
                }
            }
            System.out.println(d);
        }

        sc.close();
    }

    private static int lowerBound(long[] a, long value) {
        int left = 0, right = a.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (a[mid] < value) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;  // This is the index of the first element not less than value
    }
}



