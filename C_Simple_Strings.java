import java.util.*;

public class C_Simple_Strings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);

        int n = s.length();

        for(int i=1; i<n;i++){
            if(sb.charAt(i) == sb.charAt(i-1)){
                for(int j=0; j<26; j++){
                    char replacement = (char)('a' + j);

                    if(sb.charAt(i-1) != replacement && (i+1 == n || sb.charAt(i+1) != replacement)){
                        sb.setCharAt(i, replacement);
                        break;
                    }
                }
            }
        }

        System.out.println(sb.toString());
    }
}