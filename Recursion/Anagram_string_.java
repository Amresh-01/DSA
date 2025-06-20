
//                                               Anagram String
import java.util.*;
import java.util.*;

public class Anagram_String_{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println(false);
        } else {
            char[] str1char = str1.toCharArray();
            char[] str2char = str2.toCharArray();

            Arrays.sort(str1char);
            Arrays.sort(str2char);

            boolean isAnagram = true;
            for (int i = 0; i < str1.length(); i++) {
                if (str1char[i] != str2char[i]) {
                    isAnagram = false;
                    break;
                }
            }

            System.out.println(isAnagram);
        }

        sc.close();
    }
}
