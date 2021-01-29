import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

//    public PassengerTest(){
//
//
//    }

//    @Before
//    public void Passenger(){
//        passenger = new Passenger("Leo", 1);
//    }

    @Test
    public void hasName(){
        passenger = new Passenger("Leo", 1);
        assertEquals("Leo", passenger.getName());
    }

    @Test
    public void hasBags(){
        passenger = new Passenger("Leo", 1);
        assertEquals(1, passenger.getNumberOfBags());
    }


}
