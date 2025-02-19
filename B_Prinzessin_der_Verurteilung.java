import java.util.*;

public class B_Prinzessin_der_Verurteilung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            String res = solve(n, s);
            
            System.out.println(res);
        }

        sc.close();
    }

    private static String solve(int n, String s){

        //length 1
        Set<String> set = new HashSet<>();

        for(int i=0; i<n; i++){
            String temp = "";
            temp += s.charAt(i);
            set.add(temp);
        }

        for(int i=0; i<26; i++){
            String temp = "";
            char ch = (char)(i + 'a');
            temp += ch;

            if(!set.contains(temp)){
                return temp;
            }
        }
        
        //length 2
        set = new HashSet<>();
        for(int i=0; i<n-1; i++){
            String temp = "";
            temp += s.charAt(i);
            temp += s.charAt(i+1);
            set.add(temp);
        }

        for(int i=0; i<26; i++){
            for(int j=0; j<26; j++){

                String temp = "";
                temp += (char)(i+'a');
                temp += (char)(j+'a');

                if (!set.contains(temp)) {
                    return temp;
                }
            }
        }

        //length 3
        set = new HashSet<>();
        for(int i=0; i<n-2; i++){
            String temp = "";
            temp += s.charAt(i);
            temp += s.charAt(i+1);
            temp += s.charAt(i+2);

            set.add(temp);
        }

        for(int i=0; i<26; i++){
            for(int j=0; j<26; j++){

                String temp = "";
                temp += 'a';
                temp += (char)(i+'a');
                temp += (char)(j+'a');

                if(!set.contains(temp)){
                    return temp;
                }
            }
        }
        return "";

    }
}