import java.util.Scanner;

public class B_JoJo_s_Incredible_Adventures {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        while (testCases-- > 0) {
            String s = sc.nextLine().trim();
            int n = s.length();
            
            // Find the maximum length of contiguous '1's
            int maxLen = 0;
            int cnt = 0;
            
            // Traverse the string to find the maximum length of '1's
            for (int i = 0; i < n; ) {
                cnt = 0;
                while (i < n && s.charAt(i) == '1') {
                    cnt++;
                    maxLen = Math.max(maxLen, cnt);
                    i++;
                }
                i++; // Move past the '0' to start a new segment
            }
            
            // Calculate the length of the longest prefix of '1's
            int prefixLen = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') break;
                prefixLen++;
            }
            
            // Calculate the length of the longest suffix of '1's
            int suffixLen = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == '0') break;
                suffixLen++;
            }
            
            // Combine the prefix and suffix lengths
            int totalLen = Math.min(n, prefixLen + suffixLen);
            maxLen = Math.max(maxLen, totalLen);
            
            // Calculate the result
            long result;
            if (maxLen == n) {
                // All characters are '1's
                result = (long) n * n;
            } else {
                // Use long to prevent overflow
                maxLen++;
                long l = maxLen / 2;
                long b = maxLen - l;
                result = l * b;
            }
            
            System.out.println(result);
        }
        
        sc.close();
    }
}

