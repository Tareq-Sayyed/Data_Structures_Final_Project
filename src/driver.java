import java.util.*;
public class driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AirlineList airlines = new AirlineList();
        airlines.insert_at_back("Emirates Airlines"); airlines.insert_at_back("Etihad Airways");
        airlines.insert_at_back("MEA"); airlines.insert_at_back("Qatar Airways");
        airlines.insert_at_back("Lufthansa"); airlines.insert_at_back("British Airways");

        // Creating Lists for the passengers of each airline.
        PlanePassengers pp1 = new PlanePassengers("Emirates Airlines");
        PlanePassengers pp2 = new PlanePassengers("Etihad Airways");
        PlanePassengers pp3 = new PlanePassengers("MEA");
        PlanePassengers pp4 = new PlanePassengers("Qatar Airways");
        PlanePassengers pp5 = new PlanePassengers("Lufthansa");
        PlanePassengers pp6 = new PlanePassengers("British Airways");

        // Creating a LinkedList and an ArrayList for the passengers and their tickets, so we could access them later on
        LinkedList<Passenger> l = new LinkedList<Passenger>();
        ArrayList<Ticket> tickets = new ArrayList<Ticket>();

        // Printing out the main menu.
        System.out.println("Welcome to TCKTS: ");


        // Taking in the option.
        int option;
        do{
            System.out.println();
            System.out.println("---- MAIN MENU -----");
            System.out.println("What do you want to do? " +
                    "\n1- Book a ticket. \n2- Delete a ticket. " +
                    "\n3- View tickets. \n4- View passengers on airlines. " +
                    "\n5- Edit airlines. \n0- Exit Menu" +
                    "\n----- END MAIN MENU -----");
            option = input.nextInt();
            input.nextLine();
            switch (option){
                case 1:
                    airlines.display_airlines();
                    String cont = "";
                    do{
                        System.out.println("Enter your full name: ");
                        String full_name = input.nextLine();

                        System.out.println("Enter your date of birth: ");
                        String date_of_birth = input.nextLine();

                        System.out.println("Enter your gender: (M/F)");
                        char gender = input.next().charAt(0);
                        input.nextLine();

                        Passenger p = new Passenger(full_name, date_of_birth, gender);
                        l.add(p);

                        System.out.println(p.getFull_name() + " please enter your destination: ");
                        String destination = input.nextLine();

                        System.out.println(p.getFull_name() + " please enter an airline: (number)");
                        int airline_number = input.nextInt();

                        System.out.println(p.getFull_name() + " please enter a class: (number)");
                        int class_number = input.nextInt();
                        input.nextLine();

                        String airline = airlines.find_airline(airline_number - 1);

                        Ticket t = new Ticket(p,destination, airline, class_number);
                        tickets.add(t);

                        if(airline_number == 1){ pp1.insert_at_back(p); }
                        else if(airline_number == 2){ pp2.insert_at_back(p); }
                        else if(airline_number == 3){ pp3.insert_at_back(p); }
                        else if(airline_number == 4){ pp4.insert_at_back(p); }
                        else if(airline_number == 5){ pp5.insert_at_back(p); }
                        else if(airline_number == 6){ pp6.insert_at_back(p);}

                        System.out.println("Do you want to continue? y/n");
                        cont = input.nextLine();;
                    }while(cont.equalsIgnoreCase("Y"));
                    break;
                case 2:
                    System.out.println("Enter passengers name: ");
                    String delete_ticket_name = input.nextLine();
                    for (int i = 0; i < tickets.size(); i++) {
                        String temp = tickets.get(i).getPassenger().getFull_name();
                        if(temp.equalsIgnoreCase(delete_ticket_name)){
                            tickets.remove(i);
                            System.out.println("Ticket of: " + delete_ticket_name + " has been successfully deleted.");
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < tickets.size(); i++) {
                        tickets.get(i).display_ticket();
                    }
                    break;
                case 4:
                    airlines.display_airlines();
                    int airline_number = input.nextInt();
                    input.nextLine();
                    if(airline_number == 1){ pp1.display_passengers(); }
                    else if(airline_number == 2){ pp2.display_passengers(); }
                    else if(airline_number == 3){ pp3.display_passengers(); }
                    else if(airline_number == 4){ pp4.display_passengers(); }
                    else if(airline_number == 5){ pp5.display_passengers(); }
                    else if(airline_number == 6){ pp6.display_passengers(); }
                    else{ System.out.println("Airline not available."); }
                    break;
                case 5:
                    airlines.display_airlines();
                    System.out.println("Enter 1 to add an airline, 2 to delete an airline. ");
                    int edit_option = input.nextInt();
                    input.nextLine();
                    if(edit_option == 1){
                        System.out.println("Please enter the airline's name: ");
                        String airline_name = input.nextLine();
                        airlines.insert_at_back(airline_name);
                    }
                    else if(edit_option == 2){
                        System.out.println("Please enter the airline's number: ");
                        int airline_id = input.nextInt();
                        input.nextLine();
                        System.out.println(airlines.delete_at_position(airline_id));
                    }
                    break;
                default:
                    System.out.println("Option not available.");
                    break;
            }
        }while(option != 0);
    }
}