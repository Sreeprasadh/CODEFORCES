import java.util.*;
import java.io.*;
public class trafficLight{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- >0){
            int n = nextInt();
            char c = next().charAt(0);
            String s = next();

            s = s+s;
            long l = s.length();
            List<Integer> list = new ArrayList<>();
            for(int i =0; i<l; i++){
                if(s.charAt(i) == 'g'){
                    list.add(i);
                }
            }
            int ans = 0;
            for(int i=0; i<n; i++){
                if(s.charAt(i) == c){
                    int ub = lowerBound(i, 0, list.size()-1, list);
                    ans = Math.max(ans, list.get(ub) - i);
                }
            }
            System.out.println(ans);
        }

    }
    private static int lowerBound(int target, int low, int high, List<Integer> list ){
        while(low<=high){
            int mid = low + (high - low)/2;
            if(list.get(mid) > target){
                high = mid -1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
     static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
              st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }
    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
        
}