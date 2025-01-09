import java.util.*;
import java.io.*;
public class minimumLCM{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    private static long lcm(long a, long b){
        return (a*b)/gcd(a,b);

    }
    private static long gcd(long a, long b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }

    public static void main(String[] args) throws IOException{
        int t = nextInt();
        while(t-- >0){
            long n = Long.parseLong(next());
            if(n%2 ==0){
                System.out.println(n/2 +" "+ n/2);
            }
            else{
            List<Long> divisors = new ArrayList<>();
            
            for(long i=2; i*i <=n ; i++){
                if(n%i == 0){
                    divisors.add(i);
                    if(n/i != i){
                        divisors.add(n/i);
                    }
                }
            }

            long a =1, b = n-1;
            long ans = lcm(a,b);
            for(Long el : divisors){
               long sec = n/el;
               long temp1 = el *1;
               long temp2 = el * (sec -1);
               
               long tempans = lcm(temp1, temp2);
               if(tempans < ans){
                ans = tempans;
                a = temp1;
                b = temp2;
               }

            }
            System.out.println(a +" "+ b);
           }
  
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
        