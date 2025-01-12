import java.util.*;

public class C_Virus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 

        while (t-- > 0) {
            long n = sc.nextLong(); 

            int m = sc.nextInt();

            long[] arr = new long[m];

            for(int i=0; i<m; i++){
                arr[i] = sc.nextLong();
            }

            Arrays.sort(arr);

            ArrayList<Long> left = new ArrayList<>();

            for(int i=0; i<m; i++){

                if(i == m-1){
                    left.add(n-arr[i] + arr[(i+1)%m] -1);
                }

                if(i+1 < m && arr[i+1] - arr[i] -1 > 0){
                    left.add(arr[i+1] - arr[i] -1);
                }
            }

            Collections.sort(left, Collections.reverseOrder());
            
            long time = 0;
            long saved = 0;
            int len = left.size();

            for(int i=0; i<len; i++){

                long rem = left.get(i) - (2 * time);

                if(rem > 2){
                    rem --;
                    saved += rem;
                    time +=2;
                }
                else{

                    if(rem ==1 || rem ==2){
                        saved += 1;
                        time ++;
                    }
                }
            }
            System.out.println(n - saved);

        }

        sc.close();
    }
}