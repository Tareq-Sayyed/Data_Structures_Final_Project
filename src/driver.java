public class driver {
    public static void main(String[] args) {
        AirlineList airlines = new AirlineList();
        airlines.insert_at_back("Emirates Airlines"); airlines.insert_at_back("Etihad Airways");
        airlines.insert_at_back("MEA"); airlines.insert_at_back("Qatar Airways");
        airlines.insert_at_back("Lufthansa"); airlines.insert_at_back("British Airways");

        airlines.display_airlines();
        FirstClassList fl = new FirstClassList();
        Passenger p1 = new Passenger("Tareq El-Sayyed", "09/05/2003",'M');
        Passenger p2 = new Passenger("Charbel Abi Khalil", "30/07/2002",'M');
        Passenger p3 = new Passenger("Kevn Abdo", "03/03/2002",'M');
        fl.insert_at_back(p1); fl.insert_at_back(p2); fl.insert_at_back(p3);
        fl.display_first_class_passengers();

        BusinessClassList bl = new BusinessClassList();
        Passenger p4 = new Passenger("Mohammed Nomaan", "20/05/2001",'M');
        Passenger p5 = new Passenger("Mohammed Nahhal", "21/09/2001",'M');
        Passenger p6 = new Passenger("Hadi Youness", "03/03/2002",'M');
        bl.insert_at_back(p4); bl.insert_at_back(p5); bl.insert_at_back(p6);
        bl.display_business_class_passengers();

        EconomyClassList el = new EconomyClassList();
        Passenger p7 = new Passenger("Ali Mansoor", "20/05/2001",'M');
        Passenger p8 = new Passenger("Anthony Badr", "14/05/2002",'M');
        Passenger p9 = new Passenger("Anthony Tebshrani", "13/01/2003",'M');
        el.insert_at_back(p7); el.insert_at_back(p8); el.insert_at_back(p9);
        el.display_economy_class_passengers();
    }
}
