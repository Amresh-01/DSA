
import java.util.*;

public class max_min_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in an array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxArr = arr[0];
        int minArr = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (minArr > arr[i]) {
                minArr = arr[i];
            }
            if (maxArr < arr[i]) {
                maxArr = arr[i];
            }
        }
        System.out.println("Minimum number is: " + minArr);
        System.out.println("Maximum number is: " + maxArr);
    }
}
