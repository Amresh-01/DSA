
public class Sum_of_n_no {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }

        int sum = n + sum(n - 1);
        return sum;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(sum(n));
    }
}
