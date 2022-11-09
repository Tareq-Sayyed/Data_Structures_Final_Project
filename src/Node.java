public class Node {
    public Passenger passenger;
    public String airline;
    public Node next;

    // The Constructor Methods.
    public Node(){}
    public Node(Passenger passenger){ this.passenger = passenger; }
    public Node(String airline){ this.airline = airline; }
}
