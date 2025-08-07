
import java.util.*;

public class Spiral {

    public static void printSpiral(int[][] arr) {

        int n = arr.length;
        int m = arr[0].length;
        int sc = 0;    // Starting Col
        int sr = 0;    // starting Row
        int er = n - 1;   // ending row 
        int ec = n - 1;     // ending col
        int row = 0;
        int col = 0;

        while (sc <= ec && sr <= er) {

            // col downward 
            col = sc;

            for (row = sr; row <= er; row++) {

                System.out.print(arr[row][col] + " ");

            }

            sc++;
            // row towards right
            row = er;

            for (col = sc; col <= ec; col++) {
                System.out.print(arr[row][col] + " ");
            }

            er--;
            // col upwards
            col = ec;

            for (row = er; row >= sr; row--) {
                System.out.print(arr[row][col] + " ");
            }

            ec--;
            // row towards left
            row = sr;

            for (col = ec; col >= sc; col--) {
                System.out.print(arr[row][col] + " ");
            }
            sr++;
        }
    }

    public static void main(String args[]) {

        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        printSpiral(arr);

    }
}
