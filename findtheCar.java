import java.util.*;
import java.io.*;
public class findtheCar{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- >0){
          int n = nextInt();
          int k = nextInt();
          int q = nextInt();
          int[] a = new int[k];
          int[] b = new int[k];
          for(int i=0; i<k; i++){
            a[i] = nextInt();
            b[i] = nextInt();
          }
          a[0] =0; 
          b[0] =0;
          while(q-- >0){
            int d = nextInt();
            int lb = lowerBound(d,a);
            
            if()
            int ub = lb + 1;
            
            int dis = (a[ub] - a[lb]);
            int time = b[ub] - b[lb];
            int v = dis/time;

            int td = (d-a[lb])/v;
            System.out.print(td + " ");
          }
          System.out.println();
        }
    }
    private static int lowerBound(int d, int[] a){
        int low = 0;
        int high = a.length -1;

        while(low < high){
            int mid = low + (high - low)/2;
            if(a[mid] < d){
                low = mid+1;
            }
            else{
                high = mid;
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