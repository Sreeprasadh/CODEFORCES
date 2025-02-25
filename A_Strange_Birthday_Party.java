import java.io.*;
import java.util.*;

public class A_Strange_Birthday_Party {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());  // Reading the number of test cases

        while (t-- > 0) {
            String[] firstLine = br.readLine().split(" ");
            int n = Integer.parseInt(firstLine[0]);  // Number of friends
            int m = Integer.parseInt(firstLine[1]);  // Number of different gifts

            int[] assigned = new int[n];
            long[] presentPrice = new long[m];

            // Reading the assigned gift preferences
            String[] assignedStr = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                assigned[i] = Integer.parseInt(assignedStr[i]) - 1;  // Convert to 0-based index
            }

            // Reading the gift prices
            String[] presentPriceStr = br.readLine().split(" ");
            for (int i = 0; i < m; i++) {
                presentPrice[i] = Long.parseLong(presentPriceStr[i]);
            }

            // Sort the friends by their preference
            Arrays.sort(assigned);

            long totalCost = 0;
            int giftIndex = 0;

            // Process each friend, starting from the one with the highest preferred gift
            for (int i = n - 1; i >= 0; i--) {
                // Assign a cheaper gift if possible
                if (giftIndex < assigned[i]) {
                    totalCost += presentPrice[giftIndex];
                    giftIndex++;
                } else {
                    totalCost += presentPrice[assigned[i]];
                }
            }

            // Writing the result
            bw.write(totalCost + "\n");
        }

        bw.flush();  // Ensure all output is written
        bw.close();
        br.close();
    }
}



