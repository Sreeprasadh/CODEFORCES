import java.util.Scanner;

public class B_Kill_Demodogs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int mod = 1000000007;

        while (T-- > 0) {
            long n = sc.nextLong();

            long sum1 = findSquaresum(n, mod);
            long sum2 = findSquaresum(n - 1, mod);
            long sum3 = findSum(n - 1, mod);

            long ans = ((sum1 + sum2 + sum3) % mod) * 2022L % mod; // Use long constant to avoid overflow

            System.out.println(ans);
        }

        sc.close();
    }

    private static long findSquaresum(long n, int mod) {
        // Compute (n * (n + 1) * (2n + 1) / 6) % mod
        long nMod = n % mod;
        long nPlus1Mod = (n + 1) % mod;
        long twoNPlus1Mod = (2 * n + 1) % mod;

        long res = (nMod * nPlus1Mod % mod) * twoNPlus1Mod % mod;
        res = res * powMod(6, mod - 2, mod) % mod; // Using modular exponentiation for division
        return res;
    }

    private static long findSum(long n, int mod) {
        // Compute (n * (n + 1) / 2) % mod
        long nMod = n % mod;
        long nPlus1Mod = (n + 1) % mod;

        long res = (nMod * nPlus1Mod % mod) * powMod(2, mod - 2, mod) % mod; // Using modular exponentiation for division
        return res;
    }

    private static long powMod(long base, long exp, int mod) {
        // Modular exponentiation
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = result * base % mod;
            }
            base = base * base % mod;
            exp /= 2;
        }
        return result;
    }
}

