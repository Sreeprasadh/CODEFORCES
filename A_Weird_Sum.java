import java.util.*;

public class A_Weird_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }    

        Map<Integer, List<Integer>> mapX = new HashMap<>();
        Map<Integer, List<Integer>> mapY = new HashMap<>();
        
        // Populate mapX and mapY with row and column indices
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                int value = mat[i][j];
                mapX.computeIfAbsent(value, k -> new ArrayList<>()).add(i);
                mapY.computeIfAbsent(value, k -> new ArrayList<>()).add(j);
            }
        }

        long manhattan = 0;

        // Calculate Manhattan distance for x-coordinates
        for (Map.Entry<Integer, List<Integer>> entry : mapX.entrySet()) {
            List<Integer> xcor = entry.getValue();
            Collections.sort(xcor);
            manhattan += calculateDistance(xcor);
        }

        // Calculate Manhattan distance for y-coordinates
        for (Map.Entry<Integer, List<Integer>> entry : mapY.entrySet()) {
            List<Integer> ycor = entry.getValue();
            Collections.sort(ycor);
            manhattan += calculateDistance(ycor);
        }

        System.out.println(manhattan);
        sc.close();
    }

    // Helper method to calculate the Manhattan distance for sorted coordinates
    private static long calculateDistance(List<Integer> coordinates) {
        long distance = 0;
        long sum = 0;
        int size = coordinates.size();

        // Compute the initial sum of coordinates
        for (int coordinate : coordinates) {
            sum += coordinate;
        }

        long cumulativeSum = 0;
        
        // Iterate through coordinates to compute distance
        for (int i = 0; i < size; i++) {
            int cur = coordinates.get(i);
            long rightSum = sum - cumulativeSum - cur; // Sum of remaining elements to the right
            int remsz = size - i - 1;

            // Calculate Manhattan distance by subtracting the current cumulative value
            distance += (rightSum - (remsz * (long) cur));
            cumulativeSum += cur;
        }

        return distance;
    }
}


