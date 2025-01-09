import java.util.*;
public class 378QAQ{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){

            int n = sc.nextInt();

            ArrayList<Long> a = new ArrayList<>();

            for(int i=0; i<n; i++){
                a.get(i) = sc.nextInt();
            }
            Collections.sort(a);
            ArrayList<Long> b = new ArrayList<>();
            long f = a.get(0);
            for(int i=0; i<n; i++){
               
                if(a.get(i) % f !=0){
                  b.add(a.get(i));
                }
            }

            long s = b.get(0);
            boolean flag = true;
            for(int i =0; i<b.size(); i++){
                if(b.get(i) % s != 0){
                    flag = false;
                    break;
                }
            }
            System.out.println(flag ? "Yes " : "No ");

        }

    }
}