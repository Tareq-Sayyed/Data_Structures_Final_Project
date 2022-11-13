import java.util.*;
public class driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AirlineList airlines = new AirlineList();
        airlines.insert_at_back("Emirates Airlines"); airlines.insert_at_back("Etihad Airways");
        airlines.insert_at_back("MEA"); airlines.insert_at_back("Qatar Airways");
        airlines.insert_at_back("Lufthansa"); airlines.insert_at_back("British Airways");

        airlines.display_airlines();

        Passenger p1 = new Passenger("Tareq El-Sayyed", "09/05/2003",'M');
        System.out.println(p1.getFull_name() + " please enter your destination: ");
        String destination = input.nextLine();
        System.out.println(p1.getFull_name() + " please enter an airline: (number)");
        int airline_number = input.nextInt();
        System.out.println(p1.getFull_name() + " please enter a class: (number)");
        int class_number = input.nextInt();
        String airline = airlines.find_airline(airline_number - 1);
        Ticket t1 = new Ticket(p1,destination, airline, class_number);

        t1.display_ticket();
    }
}
