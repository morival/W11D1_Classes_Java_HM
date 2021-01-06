import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer printer;

    @Before
    public void setUp() {printer = new Printer(10,0);}

    @Test
    public void getNumOfPages() {assertEquals(10,printer.getNumOfPages());}

    @Test
    public void getNumOfCopies() {assertEquals(0, printer.getNumOfCopies());}

    @Test
    public void print() {assertEquals(1, printer.getNumOfCopies());}
}
