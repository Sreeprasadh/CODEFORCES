import java.util.*;
public class manhattanCircle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
           int n = sc.nextInt();
           int m = sc.nextInt();

           char[][] a = new char[n][m];
           for(int i=0; i<n; i++){
             String row = sc.next();
            for(int j=0; j<m; j++){
                a[i][j] = row.charAt(j);
            }
           }
           
           int rows = -1;
           int rowe = -1;
           boolean flag = true;
           for(int i=0; i<n; i++){
         
            for(int j=0; j<m; j++){
               if(flag == true && a[i][j] == '#'){
                rows = i+1;
                rowe = i+1;
                flag = false;
                break;
               } 
               if(flag == false && a[i][j] == '#'){
                rowe = i+1;
                break;
               }
            }
            
           }

           int centreRow = (rows + rowe)/2;
           int temprow = ((rows -1) + (rowe -1))/2;
           int cols = -1;
           int cole = -1;
           flag = true;

           for(int j=0; j< m; j++){
            if(flag == true && a[temprow][j] == '#'){
              cols = j+1;
              cole = j+1;
              flag = false;
            }
            if(flag == false && a[temprow][j] == '#'){
                cole = j+1;
            }
           }

           int centreCol = (cols + cole)/2;

           System.out.println(centreRow + " " + centreCol);
        }
    }
}