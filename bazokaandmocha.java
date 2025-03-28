import java.util.*;
public class bazokaandmocha{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){

            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();

            for(int i=0; i<n; i++){
                a.add(sc.nextInt());
            }
            boolean flag = false;
            for(int i=0; i<n; i++){

                if(isSorted(a,n)){
                  flag = true;
                  break;
                }
                Collections.rotate(a, -1);
            }
            System.out.println(flag ? "YES " : "NO ");
        }
    }
    private static boolean isSorted(ArrayList<Integer> a, int n){

        for(int i=1; i<n; i++){
            if(a.get(i-1) > a.get(i)){
                return false;
            }
        }
        return true;
    }
}