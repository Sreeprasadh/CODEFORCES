import java.util.Scanner;

public class ChatBan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();
            int x = sc.nextInt();

            // Calculate the total sums
            int sum = (k * (k + 1)) / 2;       // Sum of first k natural numbers
            int rem_sum = (k * (k - 1)) / 2;   // Sum of first k-1 natural numbers
            int tot_sum = sum + rem_sum;       // Total sum

            // If total sum is less than or equal to x
            if (rem_sum + sum <= x) {
                System.out.println(2 * k - 1);
                continue;
            }

            int rem = x - sum;

            if (rem < 0) {
                // Calculate messages when remaining is less than 0
                double messages = Math.ceil((-1 + Math.sqrt(1 + 8 * x)) / 2);
                double l = messages * (messages + 1) / 2;
                if ((int) l < x) messages++;
                System.out.println((int) messages);
                continue;
            }

            if (rem == 0) {
                System.out.println(k);
                continue;
            }

            if (rem > 0) {
                // Calculate messages for the case where rem is positive
                int sum2 = rem_sum - rem;
                double messages = Math.floor((-1 + Math.sqrt(1 + 8 * sum2)) / 2);
                double l = tot_sum - (messages * (messages + 1) / 2);
                if ((int) l < x) messages--;
                System.out.println(2 * k - 1 - (int) messages);
                continue;
            }
        }

        sc.close();
    }
}














