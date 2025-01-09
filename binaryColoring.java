import java.util.*;
public class binaryColoring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >0) {
            long x = sc.nextInt();
            long nearestPowerOfTwo = nearestPowerOfTwo(x);

            long rem = nearestPowerOfTwo - x;

            int p = (int) (Math.log(nearestPowerOfTwo) / Math.log(2));
            int q = (int) (Math.log(rem) / Math.log(2));

            



        }
        
        
    }

    public static long nearestPowerOfTwo(long n) {
        // If n is already a power of 2, return n
        if ((n & (n - 1)) == 0) {
            return n;
        }

        // Find the position of the most significant bit (MSB) set in the binary representation of n
        int msbPosition = 0;
        while (n > 1) {
            n >>= 1; // Right shift n by 1 bit
            msbPosition++;
        }

        // Left shift 1 by msbPosition bits to get the nearest power of 2 greater than n
        return 1 << (msbPosition + 1);
    }
}