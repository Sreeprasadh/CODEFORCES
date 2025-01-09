import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class B_Box_Fitting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int w = sc.nextInt();

            Integer[] a = new Integer[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a, Collections.reverseOrder());
           
            int height = 0;
            TreeMap<Integer, Integer> map = new TreeMap<>();

            for (int width : a) {
                // Find the smallest available width in the map that is >= current width
                Integer wd = map.ceilingKey(width);
                
                if (wd != null) {
                    // Reduce the width from that slot
                    int remainingWidth = wd - width;
                    
                    // Get the count of boxes with the width 'wd'
                    int count = map.get(wd);
                    
                    // If only one box of this width, remove it from the map
                    if (count == 1) {
                        map.remove(wd);
                    } else {
                        // Otherwise, decrement the count
                        map.put(wd, count - 1);
                    }
                    
                    // If there's remaining width, add it to the map
                    if (remainingWidth > 0) {
                        map.put(remainingWidth, map.getOrDefault(remainingWidth, 0) + 1);
                    }
                } else {
                    // If no box found, increment height and add a new box with remaining width
                    height++;
                    int remainingWidth = w - width;
                    map.put(remainingWidth, map.getOrDefault(remainingWidth, 0) + 1);
                }
            }
            
            System.out.println(height);
        }

        sc.close();
    }
}