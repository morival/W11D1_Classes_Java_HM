import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle bottle;

    @Before
    public void setUp() { bottle = new WaterBottle(100);

    }
    @Test
    public void getVolume() {assertEquals(100, bottle.getVolume());}

    @Test
    public void drinkWater() {assertEquals(90, bottle.drinkWater());}

    @Test
    public void emptyBottle() {assertEquals(0, bottle.emptyBottle());}

    @Test
    public void fillBottle() {assertEquals(100, bottle.fillBottle());}
}
