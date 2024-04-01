import java.util.*;
public class servalAndMochasArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int[] a= new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            boolean flag =false;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(gcd(a[i],a[j])<=2){
                        flag = true;
                        break;
                    }
                }
            }
            if(flag == true){
                System.out.println("Yes ");
            }
            else{
                System.out.println("No ");
            }
        }
    }
        static int gcd(int a, int b){
            if(a==0){
                return b;
            }
            return gcd(b%a, a);
        }
    }
