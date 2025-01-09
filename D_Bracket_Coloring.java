import java.util.*;

public class D_Bracket_Coloring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            Stack<Character> stack1 = new Stack<>();
            Stack<Character> stack2 = new Stack<>();

            boolean color1 = false, color2 = false;
            List<Integer> clr = new ArrayList<>();

            for(int i=0; i<n; i++){
                
                if(s.charAt(i) == '('){
                    if(!stack2.isEmpty()){
                        stack2.pop();
                        clr.add(2);
                        color2 = true;
                    }else{
                        stack1.push('(');
                        clr.add(1);
                        color1 = true;
                    }

                }else{
                    if(!stack1.isEmpty()){
                        stack1.pop();
                        clr.add(1);
                    }else{
                        stack2.push(')');
                        clr.add(2);
                    }
                }
            }

            if(stack1.isEmpty() && stack2.isEmpty()){
                if(color1 == true && color2 == true){
                    System.out.println(2);
                    for(int i=0; i<clr.size(); i++){
                        System.out.print(clr.get(i) + " ");
                    }
                    System.out.println();
                }else{
                    System.out.println(1);
                    for(int i=0; i<clr.size(); i++){
                        System.out.print(1 + " ");
                    }
                    System.out.println();
                }
            }else{
                System.out.println(-1);
            }
        }
        
        sc.close();
    }
}