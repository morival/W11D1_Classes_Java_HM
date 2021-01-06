import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setUp() { calculator = new Calculator(4, 2, 5.0, 2.0);}

    @Test
    public void added() {assertEquals(6, calculator.sum());}

    @Test
    public void subtracted() {assertEquals(2, calculator.sub());}

    @Test
    public void multiplied() {assertEquals(8, calculator.mul());}

    @Test
    public void divided() {assertEquals(2.5,calculator.div(), 0);}


}
