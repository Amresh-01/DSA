
//                                            ## Pattern - 02 ##
//                                            
//                                                  12345
//                                                  1234
//                                                  123
//                                                  12
//                                                  1
// 
// 
import java.util.*;

public class pattern_02_ {

    public static void main(String[] args) {

        for (int line = 1; line <= 5; line++) {
            for (int stars = 1; stars <= 5 - line + 1; stars++) {
                System.out.print(stars);
            }
            System.out.println();
        }

    }
}
