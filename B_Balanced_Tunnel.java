import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_Balanced_Tunnel {

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
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(entry[i], i);
        }
        int i=0, j=0;
        int cnt = 0;

        while (j<n && i<n) {
            if (entry[i] == exit[j]) {
                i++;
                j++;
            }else if(map.containsKey(entry[i])){
                cnt++;
                map.remove(exit[j]);
                j++;
            }else{
                i++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}

