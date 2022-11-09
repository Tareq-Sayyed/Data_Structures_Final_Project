public class BusinessClassList {
    public Node first;

    // The Constructor Methods
    public BusinessClassList(){ first = null; }

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
        Passenger last_passenger = first.passenger;
        if (is_empty()){ return (null); }
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

    public void display_business_class_passengers(){
        if (is_empty()){ System.out.println("There are no passengers in BusinessClass, please check again later."); }
        else{
            System.out.println("Business class passengers will be listed below: ");
            Node current = first;
            int index = 1;
            while (current != null){
                System.out.print(index + "- \n" + current.passenger.display_passenger() + " \n");
                current = current.next;
                index++;
            }
        }
        System.out.println();
    }
}
