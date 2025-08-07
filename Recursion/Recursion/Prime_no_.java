
import java.util.*;

public class Prime_no_ {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the first no. : ");
            int num = sc.nextInt();
            int prime = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = 1;
                } else {
                    prime = 0;
                }
            }
            if (prime == 1) {
                System.out.println("No. is Prime.");
            } else {
                System.out.println("No. is not Prime.");
            }
            sc.close();
        }
    }
}
