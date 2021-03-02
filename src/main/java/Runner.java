import java.util.ArrayList;
import java.util.Collections;


public class Runner {
    public static void main(String[] args){

        Plane plane1 = new Plane(PlaneType.BOEING777);;
        Flight flight = new Flight(plane1, 815, "LA", "Sydney", "06:00");
        Passenger passenger = new Passenger("Sawyer", 1);
        Passenger passenger2 = new Passenger("Darla", 1);
        Passenger passenger3 = new Passenger("Leo", 1);
        Passenger passenger4 = new Passenger("Kinike", 1);
        Passenger passenger5 = new Passenger("Danny", 1);
        Passenger passenger6 = new Passenger("John", 1);
        Passenger passenger7 = new Passenger("Dolores", 1);
        flight.getPassengerBooked(passenger);
        flight.getPassengerBooked(passenger2);
        flight.getPassengerBooked(passenger3);
        flight.getPassengerBooked(passenger4);
        flight.getPassengerBooked(passenger5);
        flight.getPassengerBooked(passenger6);
        flight.getPassengerBooked(passenger7);


        ArrayList<Passenger> listOfPassengers = flight.passengers;

        for (Passenger i : listOfPassengers) {
            System.out.println(i.getName());
            Collections.sort(listOfPassengers);
        }
    }
}
