import java.util.*;
public class ReverseASubstring{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int ind1 = -1, ind2 = -1;
        boolean flag = false;
        for(int i=0; i<n-1; i++){
            if(s.charAt(i) > s.charAt(i+1)){
                ind1 = i+1;
                ind2 = i+2;
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("YES ");
            System.out.println(ind1 +" "+ ind2);
        }
        else{
            System.out.println("NO ");
        }
    }
}