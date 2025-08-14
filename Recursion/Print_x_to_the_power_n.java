
public class Print_x_to_the_power_n {

    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int xn = x * pow(x, n - 1);
        return xn;
    }

    public static void main(String[] args) {

        System.out.println(pow(2, 10));
    }
}
