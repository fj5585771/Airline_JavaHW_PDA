import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Plane plane1;
    private Passenger passenger;

    @Before
    public void setUp(){
        plane1 = new Plane(PlaneType.BOEING777); // GIVEN WE HAVE A PLANE
        flight1 = new Flight(plane1, 815, "LA", "Sydney", "06:00");
    }

    @Test
    public void passengerListStartsEmpty(){
        this.flight1.passengers.size();
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
        assertEquals(0, flight1.getPassengerCount());
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
        assertEquals(50, flight1.getAvailableSeats()); // Current capacity
        passenger = new Passenger("Sawyer", 1);
        flight1.getPassengerBooked(passenger);
        assertEquals(1, flight1.getPassengerCount());

    }
//    @Test
//    public void lessenSpaceAvailable() {
//        flight1.lessenCapacity();
//        assertEquals(49, );
//    }

}
