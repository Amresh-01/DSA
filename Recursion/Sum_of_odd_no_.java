
import java.util.*;

public class Sum_of_odd_no_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n1; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
