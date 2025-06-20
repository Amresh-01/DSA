
import java.util.Scanner;

public class Is_array_sorted{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean isIncrease = true;
        boolean isDecrease = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                isDecrease = false;  // If any pair is increasing, it's not decreasing
            }
            if (arr[i] > arr[i + 1]) {
                isIncrease = false;  // If any pair is decreasing, it's not increasing
            }
        }
        if (isDecrease) {
            System.out.println("Array is sorted in Decreasing Order");
        } else if (isIncrease) {
            System.out.println("Array is sorted in Increasing Order");
        } else {
            System.out.println("Array is not sorted");
        }
    }
}
