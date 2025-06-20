
import java.util.*;

public class LCM_two_no_ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no. : ");
        int n1 = sc.nextInt();
        System.out.println("Enter the sceond no. : ");
        int n2 = sc.nextInt();
        int lcm = lcm(n1, n2);
        System.out.println("LCM of two no. is : " + lcm);
    }

    public static int lcm(int n1, int n2) {
        int i = 1;
        while (true) {
            int factor = n1 * i;
            if (factor % n2 == 0) {
                return factor;
            }
            i++;
        }
    }
}
