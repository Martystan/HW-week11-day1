import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp(){ calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(30, calculator.add(10,20));
    }

    @Test
    public void testDeduct(){
        assertEquals(10,calculator.deduct(20,10));
    }

    @Test
    public void testMultiply(){
        assertEquals(200, calculator.multiply(10,20));
    }

    @Test
    public void testDivide(){
        assertEquals(20.25, calculator.divide(40.50,2.00), 0.01);
    }

}
