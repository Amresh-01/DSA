
import java.util.*;

public class factorial_ {

  public static int fact(int num) {
    int result = 1;
    for (int i = 1; i <= num; i++) {
      result *= i;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int factorial = fact(num);
    System.out.println(factorial);
  }
}