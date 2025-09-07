public class Linkedlist {

  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public Node head;
  public Node tail;

  public void addFirst(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void printList() {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public void add_middle(int idx, int data) {
    if (idx == 0) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    Node temp = head;
    int i = 0;

    while (i < idx - 1 && temp != null) {
      temp = temp.next;
      i++;
    }

    newNode.next = temp.next;
    temp.next = newNode;
  }

  public static void main(String[] args) {
    Linkedlist ll = new Linkedlist();
    ll.addFirst(1);
    ll.addFirst(2);
    ll.addFirst(3);
    ll.add_middle(2, 9);
    ll.printList();
  }
}