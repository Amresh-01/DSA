//                                         2019 (Number) in Word

public class Number_in_Words_ {

    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};

    public static void main(String[] args) {
        printDigits(2019);
        System.out.println();
    }

    public static void printDigits(int number) {
        if (number == 0) {
            return;
        }
        int lastDigit = number % 10;
        printDigits(number / 10);
        System.out.print(digits[lastDigit] + " ");
    }
}
