import java.util.*;

public class newfindcar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            long n, k, q;
            n = scanner.nextLong();
            k = scanner.nextLong();
            q = scanner.nextLong();
            List<Pair> a = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                long x = scanner.nextLong();
                long y = scanner.nextLong();
                a.add(new Pair(x, y));
            }
            a.add(0, new Pair(0, 0));
            while (q-- > 0) {
                long d = scanner.nextLong();
                int idx = lowerBound(a, new Pair(d, Long.MIN_VALUE));
                if (a.get(idx).X == d) {
                    System.out.print(a.get(idx).Y);
                    if (q == 0) {
                        System.out.println();
                    } else {
                        System.out.print(" ");
                    }
                    continue;
                }
                long t = a.get(idx - 1).Y;
                Pair p1 = a.get(idx - 1);
                Pair p2 = a.get(idx);
                t += (p2.Y - p1.Y) * (d - p1.X) / (p2.X - p1.X);
                System.out.print(t);
                if (q == 0) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    static class Pair {
        long X, Y;

        public Pair(long X, long Y) {
            this.X = X;
            this.Y = Y;
        }
    }

    static int lowerBound(List<Pair> a, Pair key) {
        int low = 0, high = a.size()-1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (a.get(mid).X < key.X) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
