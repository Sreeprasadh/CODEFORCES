import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BalancedTunnel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of cars
        int n = sc.nextInt();

        // Read the entry order
        int[] entry = new int[n];
        for (int i = 0; i < n; i++) {
            entry[i] = sc.nextInt();
        }

        // Read the exit order
        int[] exit = new int[n];
        for (int i = 0; i < n; i++) {
            exit[i] = sc.nextInt();
        }

        // Map to store the entry position of each car
        Map<Integer, Integer> entryIndexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            entryIndexMap.put(entry[i], i);
        }

        // Track the maximum entry index seen so far and the number of fines
        int maxEntryIndexSeen = -1;
        int fineCount = 0;

        // Process the exit array
        for (int i = 0; i < n; i++) {
            int currentCar = exit[i];
            int currentEntryIndex = entryIndexMap.get(currentCar);

            // Check if the current car overtook any car (i.e., if it entered after a car but exited before)
            if (currentEntryIndex < maxEntryIndexSeen) {
                fineCount++;
            }

            // Update the maximum entry index seen
            maxEntryIndexSeen = Math.max(maxEntryIndexSeen, currentEntryIndex);
        }

        // Output the number of cars to be fined
        System.out.println(fineCount);

        sc.close();
    }
}

