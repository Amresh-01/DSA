
import java.util.*;

public class Rain_problem {

    public static boolean findMonotonic(int[] arr, int n) {
        // It is Monotonical increasing 
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        // 
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
