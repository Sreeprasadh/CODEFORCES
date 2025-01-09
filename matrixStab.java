import java.util.*;

public class matrixStab {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            long[][] a = new long[n][m];
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    a[i][j] = sc.nextLong();
                }
            }
            
            for(int i=0; i<n; i++){

                for(int j=0; j<m; j++){
                    
                    long maxi = -1;
                    
                    if(i > 0) {
                        maxi = Math.max(maxi, a[i-1][j]);
                    }
                    if(i < n-1){
                        maxi = Math.max(maxi, a[i+1][j]);
                    }
                    if(j > 0){
                        maxi = Math.max(maxi, a[i][j-1]);
                    }
                    if(j < m-1){
                        maxi = Math.max(maxi, a[i][j+1]);
                    }

                    if(a[i][j] > maxi){
                        a[i][j] = maxi;
                    }
                    
                }
                
            }
           
           for(int i=0; i<n; i++){

            for(int j=0; j<m; j++){

                System.out.print(a[i][j] + " ");
            }
            System.out.println();
           }     
            
           }  

    }

}