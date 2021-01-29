import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Plane plane1;

    @Before
    public void setUp(){
        plane1 = new Plane(PlaneType.BOEING777);
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
    public void flightHasDepTime(){
        flight1.getDepTime();
        assertEquals("06:00", flight1.getDepTime());
    }





}
