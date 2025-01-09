import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A_Sakurako_s_Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
           int a = sc.nextInt();
           int b = sc.nextInt();

          

           if((a== 0 && b%2 == 1) ||(b==0 && a%2 ==1)){
             System.out.println("NO ");
           }
           else if(a%2== 0 && b%2 == 0){
             System.out.println("YES ");
           }
           else if(a%2 == 0 && b%2 ==1){
             System.out.println("YES ");
           }
           else if(a%2==1 && b%2 == 0){
             System.out.println("NO ");
           }
           else{
             System.out.println("NO ");
           }
        }

        sc.close();
    }
}