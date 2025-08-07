
import java.util.Arrays;

public class binarysearch {

    public static int binarysearch(int[] numbers, int key) {

        int start = 0, end = numbers.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {224, 33, 4, 8, 9, 98};
        Arrays.sort(numbers); // Sort before binary search
        int key = 224;
        int index = binarysearch(numbers, key);
        System.out.println("Index for key is: " + index);
    }
}
