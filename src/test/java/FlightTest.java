import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Plane plane1;
    private Passenger passenger;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;
    private Passenger passenger6;
    private Passenger passenger7;

    @Before
    public void setUp(){
        plane1 = new Plane(PlaneType.BOEING777); // GIVEN WE HAVE A PLANE
        flight1 = new Flight(plane1, 815, "LA", "Sydney", "06:00");
        passenger1 = new Passenger("Sawyer", 1);
        passenger2 = new Passenger("Darla", 1);
        passenger3 = new Passenger("Leo", 1);
        passenger4 = new Passenger("Kinike", 1);
        passenger5 = new Passenger("Danny", 1);
        passenger6 = new Passenger("John", 1);
        passenger7 = new Passenger("Dolores", 1);
    }

    @Test
    public void passengerListStartsEmpty(){
        flight1.getPassengerCount();
        assertEquals(0, flight1.getPassengerCount());
    }

    @Test
    public void flightHasPlane(){
        flight1.getPlane();
        assertEquals(plane1, flight1.getPlane());
    }

    @Test
    public void flightHasNumber(){
        flight1.getNumber();
        assertEquals(815, flight1.getNumber());
    }

    @Test
    public void flightHasDestination(){
        flight1.getDestination();
        assertEquals("LA", flight1.getDestination());
    }
    
    @Test
    public void flightHasApDep(){
        flight1.getDepAp();
        assertEquals("Sydney", flight1.getDepAp());
    }

    @Test
    public void flightHasListOfPassengers(){
        flight1.getPassengerCount();
        assertEquals(7, flight1.getPassengerCount());
    }

    @Test
    public void flightHasDepTime(){
        flight1.getDepTime();
        assertEquals("06:00", flight1.getDepTime());
    }

//    should return number of available seats
    @Test
    public void flightHasNumOfSeatsAv(){
        flight1.getAvailableSeats();//        AND the plane has enough space
        assertEquals(50, flight1.getAvailableSeats()); //        THEN return the number of available seats
    }

    @Test
    public void canBookPassengerOnFlight(){
        passenger = new Passenger("Sawyer", 1);
        flight1.getPassengerBooked(passenger);
        assertEquals(1, flight1.getPassengerCount());
    }

    @Test
    public void flightBaggageWeight(){
        int baggageWeightOfFlight = flight1.baggageWeight();
        assertEquals(500, baggageWeightOfFlight);
    }

    @Test
    public void flightHasBaggageAvailableForEachPassenger(){
        assertEquals(10, flight1.baggage4EachPassenger());
    }

    @Test
    public void flightHasBaggageBookedByAPassenger(){
        passenger = new Passenger("Sawyer", 15);
        flight1.getPassengerBooked(passenger);
        assertEquals("Must check in less bags", this.flight1.allowCustomerBookingIfMaxBaggageNotExceeded());
    }

//    @Test
//    public void canAddHostOfNewPassengers(){
////        passenger1 = new Passenger("Sawyer", 1);
////        flight1.getPassengerBooked(passenger1);
////        passenger2 = new Passenger("Darla", 1);
////        flight1.getPassengerBooked(passenger2);
////        passenger3 = new Passenger("Leo", 1);
////        flight1.getPassengerBooked(passenger3);
////        passenger4 = new Passenger("Kinike", 1);
////        flight1.getPassengerBooked(passenger4);
////        passenger5 = new Passenger("Danny", 1);
////        flight1.getPassengerBooked(passenger5);
////        passenger6 = new Passenger("John", 1);
////        flight1.getPassengerBooked(passenger6);
////        passenger7 = new Passenger("Dolores", 1);
////        flight1.getPassengerBooked(passenger7);
//        assertEquals(7, flight1.getPassengerCount());
//    }

    @Test
    public void canSortCurrentListOfPassengersByStringValue(){
//        given: we have a list of passengers booked on to flight1
        flight1.getPassengerBooked(passenger1);
        flight1.getPassengerBooked(passenger2);
        flight1.getPassengerBooked(passenger3);
        flight1.getPassengerBooked(passenger4);
        flight1.getPassengerBooked(passenger5);
        flight1.getPassengerBooked(passenger6);
        flight1.getPassengerBooked(passenger7);
//        when: we grab the sorted arraylist method behaviour from our Flight class
        ArrayList<Passenger> sortedPassengers = flight1.sortPassengerByStringName();
//        then: assert string key values have been returned in ascending alphabetical order
        assertEquals((["Danny", "Darla", "Dolores", "John", "Kinike", "Sawyer"]), sortedPassengers);

    }


}
