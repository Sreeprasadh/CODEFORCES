import java.util.*;
public class catFoxandLonelyArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            long[] v = new long[n];
            for(int i=0; i<n; i++){
                v[i] = sc.nextLong();
            }

            int l =1;
            int h = n;
            int ans = n;

            while(l<=h){
                int mid = l+ (h-l)/2;

                if(check(mid, v, n)){
                    ans = mid;
                    h = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
            System.out.println(ans);

        }
    }
    private static boolean check(int k,long[] v, int n){
        long[] bits = new long[22];
        
        for(int i=0;i<k; i++){
            int j=0;
            long x = v[i];

            while(x>0){
                if(x%2 !=0){
                    bits[j]++ ;
                }
                j++;
                x = x/2;
            }
        }

        long[] freq = bits.clone();
        for(int i=k; i<n; i++){
            int j =0;
            long x = v[i];

            while(x>0){
                if(x%2 !=0){
                   freq[j]++;
                }
                j++;
                x = x/2;
            }
            j =0;
            x = v[i-k];
            while(x >0){
                if(x%2 !=0){
                    freq[j]--;
                }
                j++;
                x = x/2;
            }
            for(int f=0; f<22 ;f++){
                if(freq[f]>0 && bits[f]==0) return false;
                if(freq[f]==0 && bits[f]>0) return false;
            }
        }
        return true;
    }
}