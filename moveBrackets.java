import java.util.*;
public class moveBrackets{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- >0){
            int n = sc.nextInt();
            String s = sc.next();

            Stack<Character> st = new Stack<>();

            for(int i=0; i<n; i++){
               
                if(!st.isEmpty() && st.peek() == '(' && s.charAt(i)== ')'){
                    st.pop();
                }
              
                else{
                    st.push(s.charAt(i));
                }
             
            }
            int len = st.size();
            System.out.println(len/2);
        }
    }
}