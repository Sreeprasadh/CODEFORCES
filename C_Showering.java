import java.util.Scanner;

public class C_Showering {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCases = sc.nextInt();
        sc.nextLine(); 
        
        while (testCases-- > 0) {
            int n = sc.nextInt();
            long s= sc.nextLong();
            long m = sc.nextLong();

            long[][] a = new long[n][2];

            for(int i=0; i<n; i++){
                for(int j=0; j<2; j++){

                    a[i][j] = sc.nextLong();
                }
            }

            long lowest = 0;
            boolean flag = false;

            if(a[0][0] >= s || m - a[n-1][1] >= s){
                System.out.println("YES ");
                continue;
            }
            else{

                for(int i=1; i<n; i++){
                        if(a[i][0] - a[i-1][1] >= s){
                            flag = true;
                            break;
                        }
                    }
                }
                if(flag){
                    System.out.println("YES ");
                }
                else{
                    System.out.println("NO ");
                }

            }
            sc.close();
        }     
        
}


