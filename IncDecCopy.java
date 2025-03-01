import java.util.*;
public class IncDecCopy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- >0){

            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();

            for(int i=0;i<n; i++){
                a.add(sc.nextInt());
            }
            for(int i=0;i<n+1; i++){
                b.add(sc.nextInt());
            }

            long op = 1;
            int last = b.get(n);
            long add = (long)1e9 + 10;

            for(int i=0; i<n; i++){
                int x = Math.min(a.get(i), b.get(i));
                int y = Math.max(a.get(i), b.get(i));
                op += Math.abs(a.get(i) - b.get(i));
                if(x <= last && last <= y){
                    add = 0;
                }
                else{
                    add = Math.min(add, Math.min(Math.abs(x - last), Math.abs(y - last)));
                }
            }
            op += add;
            System.out.println(op);
            
            }
            
        
        }
    
}