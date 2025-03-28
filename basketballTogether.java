import java.util.*;
import java.io.*;
public class basketballTogether{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException{
          int N = nextInt();
          int D = nextInt();
          int[] players = new int[N];
          for(int i=0; i<N; i++){
            players[i] = nextInt();
          }
          Arrays.sort(players);
          int rest = N, res =0;
          for(int i=N-1; i>=0 ;i--){
              int x = (D/players[i] )+1;
              if(x> rest) {
                break;
              }
              else{
                res++;
                rest -= x;
              }

          }
          System.out.println(res);

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
    
