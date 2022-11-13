import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.*;
public class Ticket {
    private Passenger passenger;
    private String destination;
    private String airline;
    private int class_number;

    // The Constructor Methods.
    public Ticket(){}
    public Ticket(Passenger passenger, String destination, String airline,  int class_number){
        this.passenger = passenger;
        this.destination = destination;
        this.airline = airline;
        this.class_number = class_number;
    }

    // The Get & Set Methods.
    public Passenger getPassenger() { return passenger; }
    public String getDestination() { return destination; }
    public String getAirline() { return airline; }
    public int getClass_number() { return class_number; }

    // The Set Methods.
    public void setPassenger(Passenger passenger) { this.passenger = passenger; }
    public void setDestination(String destination) { this.destination = destination; }
    public void setAirline(String airline) { this.airline = airline; }
    public void setClass_number(int class_number) { this.class_number = class_number; }

    // Other Method(s).
    public void display_ticket(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String ticket_class = "";
        double price = 0;
        if(getClass_number() == 1){
            ticket_class = "First-Class";
            price = 4978.69;
        }
        else if(getClass_number() == 2){
            ticket_class = "Business-Class";
            price = 2500;
        }
        else if(getClass_number() == 3){
            ticket_class = "Economy-Class";
            price = 420.69;
        }
        System.out.println("----- TICKET -----");
        System.out.println(
        "Full Name: " + passenger.getFull_name() +
        "\nDate-Of-Purchase: " + dtf.format(now) +
        "\nAirline: " + getAirline() +
        "\nClass: " + ticket_class +
        "\nPrice: $" + price
        );
        System.out.println("----- END TICKET -----");
    }


}
