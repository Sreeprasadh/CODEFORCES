import java.util.*;

public class C_Yet_Another_Card_Deck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int q = sc.nextInt(); 

        LinkedList<Integer> deck = new LinkedList<>();
      
        for(int i=0; i<n; i++){
            deck.add(sc.nextInt());
        }

        while (q -- > 0) {
            int el = sc.nextInt();

            int index = deck.indexOf(el);
            System.out.print((index+1) + " ");
            
            if(index > 0){
                Collections.rotate(deck, -(index+1)); // rotate left by index positions
            }   
        }
        System.out.println();
        sc.close();
    }
}

