
public class Fibbonacci_recursion {

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int fibonacci = fib(n - 1) + fib(n - 2);
        System.out.println(fib(n - 1));
        System.out.println(fib(n - 2));
        return fibonacci;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
}
