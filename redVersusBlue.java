import java.util.*;
import java.io.*;
public class redVersusBlue{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- >0){
            int n = nextInt();

           int r = nextInt();
           int b = nextInt();

           int rcnt = r / (b+1);
           int uneven = (r % (b+1));

           String res = "";
           
           for(int i=0; i<((b+1)-uneven); i++){

               String str = "R".repeat(rcnt);
               res += str;
               res += 'B';
           }
           for(int i=0; i<uneven; i++){
             String str = "R".repeat(rcnt +1);
             res += str; 
             res += 'B';
           }
           StringBuilder sb = new StringBuilder(res);
           sb.deleteCharAt(sb.length()-1);
           System.out.println(sb);
        }
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