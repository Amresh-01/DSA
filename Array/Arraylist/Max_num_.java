
import java.util.ArrayList;

public class Max_num_ {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(4);
    list.add(3);
    list.add(4); 
    list.add(1);

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < list.size(); i++) {
      if (max < list.get(i)) {
        max = list.get(i);
      }
    }

    System.out.println("Max Elements is " + max);
  }
}
