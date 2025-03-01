import java.util.Arrays;
import java.util.Scanner;

public class B_Alyona_and_a_Narrow_Fridge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int h = sc.nextInt(); 
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int maxi = 0;

        for(int i=1; i<=n; i++){

            int[] copy = Arrays.copyOfRange(heights, 0, i);
            Arrays.sort(copy);

            int sum = 0;
            for(int j=i-1; j>=0; j-=2){
                sum += copy[j];
            }

            if(sum <= h){
                maxi = i;
            }else{
                break;
            }
        }
        System.out.println(maxi);
    }
}

