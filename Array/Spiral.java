
// import java.util.*;

// public class Spiral {

//     public static void printSpiral(int[][] arr) {

//         int n = arr.length;    //16
//         int m = arr[0].length;    //4
//         int StartingColumn = 0;    // Starting Col
//         int StartingRow = 0;    // starting Row
//         int endingRow = n - 1;   // ending row 
//         int endingColumn = n - 1;     // ending col
//         int row = 0;
//         int col = 0;

//         while (StartingColumn <= endingColumn && StartingRow <= endingRow) {

//             // col downward 
//             col = StartingColumn;

//             for (row = StartingRow; row <= endingRow; row++) {

//                 System.out.print(arr[row][col] + " ");

//             }

//             StartingColumn++;
//             // row towards right
//             row = endingRow;

//             for (col = StartingColumn; col <= endingColumn; col++) {
//                 System.out.print(arr[row][col] + " ");
//             }

//             endingRow--;
//             // col upwards
//             col = endingColumn;

//             for (row = endingRow; row >= StartingRow; row--) {
//                 System.out.print(arr[row][col] + " ");
//             }

//             endingColumn--;
//             // row towards left
//             row = StartingRow;

//             for (col = endingColumn; col >= StartingColumn; col--) {
//                 System.out.print(arr[row][col] + " ");
//             }
//             StartingRow++;
//         }
//     }

//     public static void main(String args[]) {

//         int[][] arr = {
//             {1, 2, 3, 4},
//             {5, 6, 7, 8},
//             {9, 10, 11, 12},
//             {13, 14, 15, 16}
//         };

//         printSpiral(arr);

//     }
// }


import java.util.*;

public class Spiral {

    public static void printSpiralArryay(int[][] arr) {
        int top = 0;  //1
        int bottom = arr.length - 1;  //16
        int left = 0;   //1
        int right = arr[0].length - 1;  // 4

        while(top <= bottom && left <= right){
            for(int j=left; j<=right; j++){
                System.out.print()
            }
        }
    }

    public static void main(String[] args) {

        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printSpiralArryay(arr);

    }
}