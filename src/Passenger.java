import java.util.*;
public class Passenger {
    private String  full_name;
    private String date_of_birth;
    private char gender;

    // The Constructor Method(s).
    public Passenger(){}
    public Passenger(String full_name, String date_of_birth, char gender){
        this.full_name = full_name;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
    }

    // The Get Methods.
    public String getFull_name() { return full_name; }
    public String getDate_of_birth() { return date_of_birth; }
    public char getGender() { return gender; }

    // The Set Methods.
    public void setFull_name(String full_name) { this.full_name = full_name; }
    public void setDate_of_birth(String date_of_birth) { this.date_of_birth = date_of_birth; }
    public void setGender(char gender) { this.gender = gender; }

    // The other method(s)
    public String display_passenger(){
        return ("Full Name: " + getFull_name() + "\nDate-of-Birth: " + getDate_of_birth() + "\nGender: " + getGender());
    }
}