import java.util.*;

public class helmetsinNightLight {
    static class Pair{
        long first;
        long second;
        Pair(long first, long second){
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            int p = sc.nextInt();

            long[] a= new long[n];
            long[] b = new long[n];

            for(int i=0; i<n; i++){
                a[i] = sc.nextLong();
            }
            for(int i=0; i<n; i++){
                b[i] = sc.nextLong();
            }
            
            Comparator<Pair> comparator = new Comparator<Pair>() {
              @Override
              public int compare(Pair p1, Pair p2) {
              if (p1.first == p2.first) {
                 // If the first values are equal, compare the second values in reverse order (descending)
                return Long.compare(p2.second, p1.second);
               } else {
                 // If the first values are different, compare them in ascending order
                    return Long.compare(p1.first, p2.first);
                  }
                }
            };
            
            List<Pair> list = new ArrayList<>();
            for(int i=0; i<n; i++){
                list.add(new Pair(Math.min(b[i], p), a[i]));
            }

            Collections.sort(list,comparator);

            if(n==1){
                System.out.println(p);
                continue;
            }
            else{
                long totalcost = p;
                int residents = n -1;
                
                for(int i=0; i<n-1; i++){
                    if(residents == 0){
                        break;
                    }
                    totalcost += list.get(i).first * Math.min(residents, list.get(i).second);
                    residents -= Math.min(residents, list.get(i).second);
                } 
                System.out.println(totalcost);      
            }
            
        }
    }
}
    
