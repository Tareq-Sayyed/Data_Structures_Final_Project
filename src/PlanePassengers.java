public class PlanePassengers {
    public Node first;
    private String airline;

    // The Constructor Methods.
    public PlanePassengers(String airline){
        this.airline = airline;
        first = null;
    }

    public String getAirline() { return airline; }
    public void setAirline(String airline) { this.airline = airline; }

    public boolean is_empty(){ return (first == null); }

    // Mutator Methods
    // This method inserts an airline at the BEGINNING of the list.
    public void insert_at_front(Passenger passenger){
        Node p = new Node(passenger);
        if(is_empty()){ first = p; }
        else{
            p.next = first;
            p = first;
        }
    }
    // This method inserts an airline at the END of the list.
    public void insert_at_back(Passenger passenger){
        Node p = new Node(passenger);
        if(is_empty()){ first = p; }
        else{
            Node current = first;
            while(current.next != null){ current = current.next; }
            current.next = p;
        }
    }
    // This method removes an airline from the BEGINNING of the list.
    public Passenger delete_from_front(){
        Passenger first_passenger = first.passenger;
        first = first.next;
        return first_passenger;
    }
    // This method removes an airline from the END of the list.
    public Passenger delete_from_back(){
        Passenger last_passenger = null;
        if (is_empty()){ return null; }
        else{
            Node current = first;
            Node previous = first;
            while(current.next != null){
                previous = current;
                current = current.next;
            }
            last_passenger = current.passenger;
            previous.next = null;
        }
        return last_passenger;
    }

    // The Other Method(s).
    public String find_passenger(int pos){
        Node current = first;
        for (int i = 0; i < 10; i++) {
            current = current.next;
        }
        if(current != null){ return current.passenger.display_passenger(); }
        return ("Passenger not found!");
    }
    public void display_passengers(){
        System.out.println("---------- " + getAirline() + " PASSENGERS LIST ----------");
        if (is_empty()){ System.out.println("There are no available passengers on this airline."); }
        else{
            System.out.println("All passengers onboard " + getAirline()  + " will be listed below: ");
            Node current = first;
            int index = 0;
            while (current != null){
                System.out.println((index + 1) + "- " + current.passenger.display_passenger() + " ");
                current = current.next;
                index++;
            }
        }
        System.out.println();
        System.out.println("---------- END PASSENGERS LIST ----------");
    }
}
