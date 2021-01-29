import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

   Plane plane1;

   @Before
    public void setUp(){
       plane1 = new Plane(PlaneType.BOEING777);
   }

   @Test
    public void planeHasCap(){
       assertEquals(50, plane1.getCapacity());
   }

   @Test
    public void planeHasTotalWeight(){
       assertEquals(1000, plane1.getTotalWeight());
   }

}
