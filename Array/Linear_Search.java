
import java.util.*;

public class Linear_Search {

    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;            //for  MAX_VALUE it initialise to + infinity 
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 4, 56, 7, 3, 2, 4, 55, 5566, 666, 8, 9, 90, 98789, 89, 76543456, 878, 989, 989};
        System.out.println("the largest no. is :" + getlargest(numbers));
    }
}
