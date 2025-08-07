
//                                         ## Pattern - 06 ##
// 
//                                             Floyd's Triangle
// 
//                                                1
//                                                01
//                                                101
//                                                0101
//                                                10101
// 
public class pattern_06_{

    public static void Triangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Triangle(5);
    }
}
