import java.util.Scanner;

public class A_Find_K_Distinct_Points_with_Fixed_Center {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int xc = scanner.nextInt();
            int yc = scanner.nextInt();
            int k = scanner.nextInt();

            generatePoints(xc, yc, k);
        }
        
        scanner.close();
    }

    private static void generatePoints(int xc, int yc, int k) {
        
        if(k%2 == 1){
            System.out.println(xc + " " + yc);
        }

        for(int i=1; i<=(k/2);i++){
            System.out.println((xc-i) + " " + yc);
            System.out.println((xc+i) + " " + yc);
        }
    }
}



