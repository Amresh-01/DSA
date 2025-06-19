
//  
// 
//                                   ## Given Array is Sorted or Not ##
// 
// import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         boolean isIncrease = true;
//         boolean isDecrease = true;
//         for (int i = 0; i < n - 1; i++) {
//             if (arr[i] < arr[i + 1]) {
//                 isDecrease = false;  // If any pair is increasing, it's not decreasing
//             }
//             if (arr[i] > arr[i + 1]) {
//                 isIncrease = false;  // If any pair is decreasing, it's not increasing
//             }
//         }
//         if (isDecrease) {
//             System.out.println("Array is sorted in Decreasing Order");
//         } else if (isIncrease) {
//             System.out.println("Array is sorted in Increasing Order");
//         } else {
//             System.out.println("Array is not sorted");
//         }
//     }
// }
// 
//                                   Searching Elemnt in 2-D Array
// 
// import java.util.*;
// public class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Please Enter the Row : ");
//         int row = sc.nextInt();
//         System.out.println("Please Enter the Column : ");
//         int col = sc.nextInt();
//         int[][] arr = new int[row][col];
//         for (int i = 0; i < row; i++) {
//             for (int j = 0; j < col; j++) {
//                 System.out.println("Enter the value at row " + (i + 1) + ", column " + (j + 1) + " :");
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Enter the number you want to search for: ");
//         int num = sc.nextInt();
//         boolean isFound = search(arr, num);
//         if (isFound) {
//             System.out.println("Your number was found.");
//         } else {
//             System.out.println("Your number was not found.");
//         }
//     }
//     public static boolean search(int[][] arr, int num) {
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 if (arr[i][j] == num) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }


import java.util.*;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] accounts = new int[m][n];
        int maxWealth = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            int customerWealth = 0;
            for (int j = 0; j < n; j++) {
                accounts[i][j] = sc.nextInt();
                customerWealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, customerWealth);
        }
        System.out.println("Richest Customer Wealth: " + maxWealth);
        sc.close();
    }
}
