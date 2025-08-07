
import java.util.*;

public class Search_in_2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Row : ");
        int row = sc.nextInt();
        System.out.println("Please Enter the Column : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("Enter the value at row " + (i + 1) + ", column " + (j + 1) + " :");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the number you want to search for: ");
        int num = sc.nextInt();
        boolean isFound = search(arr, num);
        if (isFound) {
            System.out.println("Your number was found.");
        } else {
            System.out.println("Your number was not found.");
        }
    }

    public static boolean search(int[][] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    return true;
                }
            }
        }
        return false;
    }
}
