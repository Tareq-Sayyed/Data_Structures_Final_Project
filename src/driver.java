import java.util.*;
public class driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AirlineList airlines = new AirlineList();
        airlines.insert_at_back("Emirates Airlines"); airlines.insert_at_back("Etihad Airways");
        airlines.insert_at_back("MEA"); airlines.insert_at_back("Qatar Airways");
        airlines.insert_at_back("Lufthansa"); airlines.insert_at_back("British Airways");

        PlanePassengers pp1 = new PlanePassengers("Emirates Airlines");
        PlanePassengers pp2 = new PlanePassengers("Etihad Airways");
        PlanePassengers pp3 = new PlanePassengers("MEA");
        PlanePassengers pp4 = new PlanePassengers("Qatar Airways");
        PlanePassengers pp5 = new PlanePassengers("Lufthansa");
        PlanePassengers pp6 = new PlanePassengers("British Airways");




        airlines.display_airlines();

        Passenger p1 = new Passenger("Tareq El-Sayyed", "09/05/2003",'M');
        LinkedList<Passenger> l = new LinkedList<Passenger>();
        LinkedList<Ticket> tits = new LinkedList<Ticket>();

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
            tits.add(t);

            if(airline_number == 1){ pp1.insert_at_back(p); }
            else if(airline_number == 2){ pp2.insert_at_back(p); }
            else if(airline_number == 3){ pp3.insert_at_back(p); }
            else if(airline_number == 4){ pp4.insert_at_back(p); }
            else if(airline_number == 5){ pp5.insert_at_back(p); }
            else if(airline_number == 6){ pp6.insert_at_back(p);}

            System.out.println("Do you want to continue? y/n");
            cont = input.nextLine();;

        }while(cont.equalsIgnoreCase("Y"));


        for (int i = 0; i < tits.size(); i++) {
            Ticket t = tits.get(i);
            t.display_ticket();
        }



        pp1.display_passengers();
        pp2.display_passengers();
        pp3.display_passengers();
        pp4.display_passengers();
        pp5.display_passengers();
        pp6.display_passengers();






    }
}
