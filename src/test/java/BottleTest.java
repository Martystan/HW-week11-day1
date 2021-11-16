import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    Bottle bottle;

    @Before
    public void setUp(){ bottle = new Bottle(100);}

    @Test
    public void startsAt100(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canDrink10(){
        assertEquals(90, bottle.drink());
    }

    @Test
    public void isEmpty(){
        assertEquals(0, bottle.empty());
    }

    @Test
    public void canBeFilled(){
        Bottle notFullBottle = new Bottle(90);
        assertEquals(100, notFullBottle.fill());
    }
}
