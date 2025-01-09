import java.util.Scanner;

public class C_Password_Cracking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        while (t-- > 0) {
            int n = sc.nextInt(); 

            
            StringBuilder cur = new StringBuilder();


            while(cur.length() < n){
                if(ask(cur.toString() + "0")){
                    cur.append('0');
                }else if(ask(cur.toString() + "1")){
                    cur.append('1');
                }else{
                    break;
                }
            }

            //finding the prefix 
            while (cur.length() < n) {
                if(ask("0" + cur.toString())){
                    cur.insert(0,"0");
                }else{
                    cur.insert(0, "1");
                }
            }

            System.out.println("! " + cur);
        }
        sc.close();
    }
    private static boolean ask(String s){
        System.out.println("? " + s);
        Scanner sc = new Scanner(System.in);
        int response = sc.nextInt();

        return (response == 1);
    }
}


