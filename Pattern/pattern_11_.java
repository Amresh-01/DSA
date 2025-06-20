//                                        ##  Pattern - 11  ##

//                                                      1
//                                                     2 2
//                                                    3 3 3
//                                                   4 4 4 4
//                                                  5 5 5 5 5 
//                                                 6 6 6 6 6 6 
import java.util.Scanner;

public class pattern_11_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 1;
        int sp = n - 1;
        // starting with Row
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            // print No. + spaces
            for (int k = 1; k <= st; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
            st++;
            sp--;
        }
    }
}
