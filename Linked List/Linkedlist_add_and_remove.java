
public class Linkedlist_add_and_remove {

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  public void addFirst(int data) {

    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = tail = newNode;
      return;
    }

    tail.next = newNode;
    tail = newNode;
  }

  public int remove_first() {

    if (size == 0) {
      System.out.println("LL is empty.");
      return Integer.MIN_VALUE;
    } else if (size == 1) {
      int val = head.data;
      head = tail = null;
      return val;
    }
    int val = head.data;
    head = head.next;
    return val;
  }

  public void print() {

    if (head == null) {
      System.out.println("LL is empty");
    }
    Node temp = head;

    while (temp != null) {
      System.out.print(temp.data + "-> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void add(int idx, int data) {
    Node newNode = new Node(data);
    Node temp = head;
    int i = 0;

    while (i < idx - 1) {
      temp = temp.next;
      i++;
    }

    newNode.next = temp.next;
    temp.next = newNode;
  }

  public static void main(String args[]) {
    Linkedlist_add_and_remove ll = new Linkedlist_add_and_remove();
    ll.print();
    ll.addFirst(1);
    ll.print();
    ll.addFirst(2);
    ll.print();
    ll.addLast(3);
    ll.print();
    ll.addLast(4);
    ll.add(2, 9);
    ll.print();
    ll.remove_first();
    ll.print();
  }
}