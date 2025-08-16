
import java.util.*;

public class opertaion {

  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(4);
    list1.add(5);
    list1.add(4, 9); // Time complexity :- 0(n)

    // Get operation
    int elemnet = list1.get(2);
    System.out.println(elemnet);

    // Delete Operation
    list1.remove(2);
    System.out.println(list1);

    // Sete Element at Index
    list1.set(2, 10);
    System.out.println(list1);

    // contains
    System.out.println(list1.contains(1));
  }
}
