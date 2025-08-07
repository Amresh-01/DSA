
import java.util.*;

public class Table {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int j = n1;
        for (int i = 1; i <= 10; i++) {
            j *= i;
            System.out.println(n1 + " X " + i + " = " + j);
            j = n1;
        }
    }
}
