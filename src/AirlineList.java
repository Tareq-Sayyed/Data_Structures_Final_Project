public class AirlineList {
    public Node first;

    // The Constructor Methods.
    public AirlineList(){ first = null; }


    public boolean is_empty(){ return (first == null); }

    // Mutator Methods
    // This method inserts an airline at the BEGINNING of the list.
    public void insert_at_front(String Airline){
        Node airline = new Node(Airline);
        if(is_empty()){ first = airline; }
        else{
            airline.next = first;
            airline = first;
        }
    }
    // This method inserts an airline at the END of the list.
    public void insert_at_back(String Airline){
        Node airline = new Node(Airline);
        if(is_empty()){ first = airline; }
        else{
            Node current = first;
            while(current.next != null){ current = current.next; }
            current.next = airline;
        }
    }

    // This method removes an airline from the BEGINNING of the list.
    public String delete_from_front(){
        String first_airline = first.airline;
        first = first.next;
        return first_airline;
    }
    // This method removes an airline from the END of the list.
    public String delete_from_back(){
        String last_airline = "";
        if (is_empty()){ return ("There are currently no available airlines.\nPlease check again later."); }
        else{
            Node current = first;
            Node previous = first;
            while(current.next != null){
                previous = current;
                current = current.next;
            }
            last_airline = current.airline;
            previous.next = null;
        }
        return last_airline;
    }

    public void display_airlines(){
        if (is_empty()){ System.out.println("There are no available airlines currently, please check again later."); }
        else{
            System.out.println("Available airlines will be listed below: ");
            Node current = first;
            int index = 1;
            while (current != null){
                System.out.print(index + "- " + current.airline + " ");
                current = current.next;
                index++;
            }
        }
        System.out.println();
    }
}