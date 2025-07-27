
//                                           ## PATTERN - 09 ##
// 
//                                                  *
//                                                  **
//                                                  ***
//                                              ********          
//                                                  ***
//                                                  **
//                                                  *


import java.util.Scanner;
public class pattern_09_{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 3;
        int st = 1;
        int i;
        for (i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*");
            }
            st++;
            System.out.println();
            if (i == (n + 1) / 2) {
                for (i = 0; i <= n; i++) {
                    System.out.print("*");
                }
                System.out.println();
                int st2 = 4;
                for (i = 1; i <= n; i++) {
                    for (int j = 1; j <= sp; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= st2; j++) {
                        System.out.print("*");
                    }
                    st2--;
                    System.out.println();
                }
            }
        }
    }
}
