import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RollerCoasterTest {

    private Rollercoaster rollercoaster;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before

    public void setUp(){
        rollercoaster = new Rollercoaster("Spinny");
        visitor1 = new Visitor(18, 160, 20);
        visitor2 = new Visitor( 10, 160, 20);

    }

    @Test
    public void isAllowed() {
        assertTrue(rollercoaster.isAllowedTo(visitor1));
    }

    @Test
    public void isNotAllowed() {
        assertFalse(rollercoaster.isAllowedTo(visitor2));
    }
}
