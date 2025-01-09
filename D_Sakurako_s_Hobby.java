import java.io.*;
import java.util.*;

public class D_Sakurako_s_Hobby {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int t = Integer.parseInt(br.readLine().trim());
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            st = new StringTokenizer(br.readLine().trim());
            int[] p = new int[n + 1]; 
            for (int i = 1; i <= n; i++) {
                p[i] = Integer.parseInt(st.nextToken());
            }
            
            String s = br.readLine().trim();
            
            
            int[] result = new int[n + 1];
            
           
            boolean[] visited = new boolean[n + 1];
            
            
            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    
                    Set<Integer> cycleNodes = new HashSet<>();
                    List<Integer> stack = new ArrayList<>();
                    int current = i;
                    
                    
                    while (!visited[current]) {
                        visited[current] = true;
                        stack.add(current);
                        cycleNodes.add(current);
                        current = p[current];
                    }
                    
                    
                    if (cycleNodes.contains(current)) {
                        int blackCount = 0;
                        for (int node : cycleNodes) {
                            if (s.charAt(node - 1) == '0') {
                                blackCount++;
                            }
                        }
                        
                       
                        for (int node : cycleNodes) {
                            result[node] = blackCount;
                        }
                    }
                }
            }
            
           
            for (int i = 1; i <= n; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
        }
        
      
        System.out.print(sb.toString());
    }
}

