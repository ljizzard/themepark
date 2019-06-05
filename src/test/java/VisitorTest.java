import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    private Visitor visitor;

    @Before
    public void setUp(){
        visitor = new Visitor(20, 160, 10);}

        @Test
    public void canGetAge(){
        assertEquals(20, visitor.getAge());
        }

    @Test
    public void canGetHeight() {
        assertEquals(160, visitor.getHeight());
    }

    @Test
    public void canGetMoney() {
        assertEquals(10, visitor.getMoney());
    }






}
