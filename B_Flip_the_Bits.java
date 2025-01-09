import java.util.*;

public class B_Flip_the_Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String a = sc.next();
            String b = sc.next();

            ArrayList<int[]> list = new ArrayList<>();

            int zero = 0, one = 0, j=0;
            for(int i=0; i<n; i++){
                if(a.charAt(i) == '1'){
                    one++;
                }else{
                    zero++;
                }

                if(one == zero){
                    list.add(new int[]{j, i});
                    j = i+1;
                }
            }

            StringBuilder sb = new StringBuilder(a);
            for(int[] it : list){
                int start = it[0];
                int end = it[1];

                if(a.charAt(start) == b.charAt(start)){
                    continue;
                }else{
                    for(int i=start; i<=end; i++){
                        if (a.charAt(i) == '0') {
                            sb.setCharAt(i, '1');
                        }else{
                            sb.setCharAt(i, '0');
                        }
                    }
                }
            }

            String newa = sb.toString();
            if(newa.equals(b)){
                System.out.println("YES ");
            }else{
                System.out.println("NO ");
            }
        }

        sc.close();
    }
}