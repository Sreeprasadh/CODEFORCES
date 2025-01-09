import java.util.*;

public class D_Matryoshkas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Number of elements

            List<Long> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(sc.nextLong());
            }
            
            // Sort the list in descending order
            Collections.sort(a, Collections.reverseOrder());

            // Frequency map
            Map<Long, Integer> frequencyMap = new HashMap<>();
            for (Long value : a) {
                frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
            }

            // List to store the frequencies in order
            List<Map.Entry<Long, Integer>> list = new ArrayList<>(frequencyMap.entrySet());
            list.sort(Map.Entry.comparingByKey(Collections.reverseOrder()));

            long ans = 0;
            int len = list.size();
            
            
                ans += list.get(0).getValue(); // Frequency of the largest element

                for (int i = 1; i < len; i++) {
                    Map.Entry<Long, Integer> current = list.get(i);
                    Map.Entry<Long, Integer> previous = list.get(i - 1);
                    
                    if (current.getKey() + 1 == previous.getKey()) {
                        ans += Math.max(current.getValue() - previous.getValue(), 0);
                    } else {
                        ans += current.getValue();
                    }
                }
            

            System.out.println(ans);
        }

        sc.close();
    }
}
