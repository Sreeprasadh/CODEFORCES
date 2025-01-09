import java.util.*;

public class DivanAndANewProject {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- >0){
            int n = sc.nextInt();
            Integer[] a = new Integer[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            
            ArrayList<Pair> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                list.add(new Pair(a[i], i));
            }

            Collections.sort(list);

            int ind = 1;
            long time = 0;
            int[] ans = new int[n];
            for(int i=n-1; i>=0; i--){
                int temp = 2 * ind;
                time = time + (temp * list.get(i).first);
                ans[list.get(i).second] = ind;
                ind++;
            }

            ind = -1;
            for(int i=n-2; i>=0; i--){

                int temp = 2 * Math.abs(ind);
                time = time + (temp * list.get(i).first);
                ans[list.get(i).second] = ind;
                ind--;
            }

            System.out.println(time);
            System.out.print(0 + " ");
            for(int i=0; i<n; i++){
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            
        }
    }


    private class Pair{
        int first;
        int second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
}