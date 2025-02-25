import java.util.Scanner;

public class B_Scale {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();  // Consume the newline after integer input

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();  // Consume the newline after integer input

            char[][] grid = new char[n][n];

            // Read the grid
            for (int i = 0; i < n; i++) {
                grid[i] = sc.nextLine().toCharArray();
            }

            int newSize = n / k;
            char[][] reducedGrid = new char[newSize][newSize];

            for(int i=0; i<newSize; i++){
                for(int j=0; j<newSize; j++){
                    char val = grid[i*k][j*k];
                    reducedGrid[i][j] = val;
                }
            }

            for(int i=0; i<newSize; i++){
                for(int j=0; j<newSize; j++){
                    System.out.print(reducedGrid[i][j]);
                }
                System.out.println();
            }
        }

        sc.close();
    }
}


