public class Node {
    private int payload;
    private Node next;
    
    // Constructors
    public Node() {
        this.payload = 0;
        this.next = null;
    }// end no arg constructor
    
    public Node(int payload) {
        this.payload = payload;
        this.next = null;
    }// end full arg constructor
    
    // Getters
    public int getPayLoad() {
        return this.payload;
    }// end getPayload
    
    public Node getNext() {
        return this.next;
    }// end getNext
    
    // Setters
    public void setPayLoad(int payload) {
        this.payload = payload;
    }// end setPayload
    
    public void setNext(Node next) {
        this.next = next;
    }// end setNext

    @Override
    public String toString() {
      return Integer.toString(this.payload);
    }// end toString
}// end Node
