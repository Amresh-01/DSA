
import java.util.*;

public class Tower_of_Hanoi_ {

    public static void main(String[] args) {
        int n = 3;
        solveHanoi(n, 'A', 'C', 'B');
    }

    public static void solveHanoi(int n, char source, char destination, char helper) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        // Move n-1 disk from rod A to rod B 
        solveHanoi(n - 1, source, helper, destination);
        System.out.println("Move disk " + n + " from rod " + source + " to " + destination);
        solveHanoi(n - 1, helper, destination, source);
    }
}
