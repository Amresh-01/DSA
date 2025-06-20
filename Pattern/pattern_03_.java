
//                                           ## Pattern - 03 ##
// 
//                                                     *
//                                                     **
//                                                     ***
//                                                     ****
//                                                     *****
//                                                     ****
//                                                     ***
//                                                     **
//                                                     *
import java.util.*;

public class pattern_03_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i <= n / 2) {
                st += 1;
            } else {
                st -= 1;
            }
        }
    }
}
