
public class Binary_string {

    public static void printBianryString(int n, int lastPlace, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBianryString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBianryString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        printBianryString(3, 0, "");
    }
}
