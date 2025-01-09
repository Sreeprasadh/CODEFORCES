import java.util.*;
public class hamburgers{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        
            String s = sc.next();
            
            int nb = sc.nextInt();
            int ns = sc.nextInt();
            int nc = sc.nextInt();

            int pb = sc.nextInt();
            int ps = sc.nextInt();
            int pc = sc.nextInt();

            long r = sc.nextLong();
            
            int len = s.length();
            int cb =0, cs =0, cc=0;
            for(int i=0; i<len; i++){
                if(s.charAt(i) == 'B'){
                    cb++;
                }
                else if(s.charAt(i) == 'S'){
                    cs++;
                }
                else{
                    cc++;
                }
            }

            long res = -1;
            long low =0, high = (long) 1e14;
            while(low <= high){
               long mid = low + (high - low)/2;
               long mrq = Possible(mid,cb,cs,cc,nb,ns,nc,pb,ps,pc);
               if(mrq<=r){
                 res = mid;
                 low = mid + 1;
                }
                else{
                  high = mid -1;
                }
            }
        
            System.out.println(res);
        
    }
    private static long Possible(long mid, int cb, int cs, int cc, int nb, int ns, int nc, int pb, int ps, int pc){
        long total = Math.max(0, (cb*mid - nb)) * pb + Math.max(0, (cs*mid - ns)) * ps + Math.max(0, (cc*mid - nc)) * pc;
        return total;
    }
}