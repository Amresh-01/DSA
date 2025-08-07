
import java.util.*;

public class Span_of_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        int max = number[0];
        int min = number[0];
        for (int i = 1; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
            if (min > number[i]) {
                min = number[i];
            }
        }
        int span = max - min;
        System.out.println("span :" + span);
    }
}
