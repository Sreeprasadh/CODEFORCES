import java.util.*;

public class updateQueries {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            String s = sc.next();
            TreeSet<Integer> set = new TreeSet<>();

            for(int i=0; i<m;i++){
               set.add(sc.nextInt());
            }

            String c = sc.next();

            ArrayList<Character> list = new ArrayList<>();

            for(char ch : c.toCharArray()){
                list.add(ch);
            }

            Collections.sort(list);

            StringBuilder sb = new StringBuilder(s);

            int x =0;
            for(Integer ind : set){
                sb.setCharAt(ind-1, list.get(x).charValue());
                x++;
            }

            System.out.println(sb.toString());

        }
    }
}