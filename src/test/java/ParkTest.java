import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    private Park park;

    @Before

    public void SetUp(){
        park = new Park("Park");
    }

    @Test
    public void getParkName(){
        assertEquals("Park", park.getName());
    }

    @Test
    public void canGetRating(){
        assertEquals(7, park.getRating());
    }

}
