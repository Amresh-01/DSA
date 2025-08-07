
//                                    ## PATTERN - 08 ##

//                                        1           1
//                                        12         21
//                                        123       321
//                                        1234     4321
//                                        12345   54321
//                                        123456 654321
//                                        1234567765432
//  


import java.util.Scanner;

public class pattern_08_{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sp = 2 * n - 3;
        int st = 1;
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print(val + "");
                val++;
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print(" ");
            }
            if (i == n) {
                st--;
            }
            for (int j = 1; j <= st; j++) {
                val--;
                System.out.print(val + "");
            }
            st++;
            sp -= 2;
            System.out.println();
        }
    }
}