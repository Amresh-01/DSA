
//                             ## Pattern - 04 ##
// 
//                                    *****
//                                     ****
//                                      ***
//                                       **
//                                        *
// 
//
import java.util.*;

public class pattern_04_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sp = 0;
        int st = 5;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < st; j++) {
                System.out.print("*");
            }
            st--;
            sp++;
            System.out.println();
        }
    }
}
