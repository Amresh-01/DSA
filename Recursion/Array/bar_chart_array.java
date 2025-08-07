
import java.util.*;

public class bar_chart_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];

        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        int max = number[0];

        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }

        for (int floor = max; floor >= 1; floor--) {
            for (int i = 0; i < number.length; i++) {
                if (number[i] > floor) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
