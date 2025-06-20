
import java.util.*;

public class Friends_pairing_ {

    public static void main(String[] args) {
        int n = 4;
        int count = countPairing(n);
        System.out.println("Number of ways to pair " + n + " friends is: " + count);
    }

    public static int countPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int pairing_alone = countPairing(n - 1);
        int pairing_pair = (n - 1) * countPairing(n - 2);
        int total_ways_pairing = pairing_pair + pairing_alone;
        return total_ways_pairing;
    }
}
