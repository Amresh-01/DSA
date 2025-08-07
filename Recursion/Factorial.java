
public class Factorial {

    public static int calc_fact(int num) {
        if (num == 0) {
            return 1;
        }
        int Factorial = num * calc_fact(num - 1);
        return Factorial;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(calc_fact(num));
    }
}
