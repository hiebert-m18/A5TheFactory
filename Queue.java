public class Queue {
  private Node tail = null;
  private Node head = null;

  public Queue() {
    // initializing Queue
  }// end constructor

  // peek
  public Node peek() {
    return head;
  }// end peek

  // enqueue
  public void enqueue(Node newNode) {
    if (this.isEmpty()) {
      tail = newNode;
      head = newNode;
    } else {
      tail.setNext(newNode);
      tail = newNode;
    }// end else if
  }// end enqueue

  // dequeue
  public Node dequeue() {
    Node temp = head;
    if (!this.isEmpty()) {
      head = head.getNext();
      temp.setNext(null);
    }// end if
    return temp;
  }// end dequeue

  // isEmpty
  public boolean isEmpty() {
    boolean b = false;
    if (head == null || tail == null) {
      b = true;
    }// end if
    return b;
  }// end isEmpty
}