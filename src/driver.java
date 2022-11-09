public class driver {
    public static void main(String[] args) {
        AirlineList airlines = new AirlineList();
        airlines.insert_at_back("Emirates Airlines"); airlines.insert_at_back("Etihad Airways");
        airlines.insert_at_back("MEA"); airlines.insert_at_back("Qatar Airways");
        airlines.insert_at_back("Lufthansa"); airlines.insert_at_back("British Airways");

        airlines.display_airlines();
        FirstClassList fl = new FirstClassList();
        Passenger p1 = new Passenger("Tareq El-Sayyed", "09/05/2003",'M');
        Passenger p2 = new Passenger("Anthony Badr", "14/05/2002",'M');
        Passenger p3 = new Passenger("Kevn Abdo", "03/03/2002",'M');
        fl.insert_at_back(p1); fl.insert_at_back(p2); fl.insert_at_back(p3);
        fl.display_first_class_passengers();

    }
}
