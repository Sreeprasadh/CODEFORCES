import java.util.*;

public class TrianglesOnRectangles {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while(T-- >0){

            int w = sc.nextInt();
            int h = sc.nextInt();
            sc.nextLine();

            int k1 = sc.nextInt();
            int[] hori1 = new int[k1];
            for(int i=0; i<k1; i++){
                hori1[i] = sc.nextInt();
            }
            sc.nextLine();

            int k2 = sc.nextInt();
            int[] hori2 = new int[k2];
            for(int i=0; i<k2; i++){
                hori2[i] = sc.nextInt();
            }
            sc.nextLine();

            int k3 = sc.nextInt();
            int[] vert1 = new int[k3];
            for(int i=0; i<k3; i++){
                vert1[i] = sc.nextInt();
            }
            sc.nextLine();

            int k4 = sc.nextInt();
            int[] vert2 = new int[k4];
            for(int i=0; i<k4; i++){
                vert2[i] = sc.nextInt();
            }
            sc.nextLine();
 
            int dif1 = Mathhori1[k1-1] - hori1[0];
            int dif2 = hori2[k2-1] - hori2[0];
            int dif3 = vert1[k3-1] - vert1[0];
            int dif4 = vert2[k4-1] - vert2[0];

            long ans = 0;
            ans = Math.max(dif1*h, dif2*h);
            ans = Math.max(ans, dif3*w);
            ans = Math.max(ans, dif4*w);

            System.out.println(ans);

        }
    }
}
