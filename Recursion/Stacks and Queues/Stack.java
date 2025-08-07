
//       Anagram String
import java.util.*;

public class Stack {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.print(false);
        } else {

            char str1char[] = str1.toCharArray();     // String ko Array mai convert kar diya.
            char str2char[] = str2.toCharArray();
            Arrays.sort(str1char);       // Array ko sort(Ascending or descending order) kar diya hai.
            Arrays.sort(str2char);

            int flag = 0;

            for (int i = 0; i < str1.length(); i++) {
                if (str1char[i] != str2char[i]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

        }
    }
}
