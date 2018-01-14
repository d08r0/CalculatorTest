import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by scrooge on 21.12.17.
 */
public class CalculatorTest {

    @Test
    public void testCalulationSum() {

        Calculator calculator = new Calculator();
        int a = 10;
        int b = 17;

        int result = 27;

        assertEquals(result, calculator.sum(a, b));
    }

    @Test
    public void testCalulationDiv() {

        Calculator calculator = new Calculator();
        int a = 20;
        int b = 10;

        int result = 2;

        assertEquals(result,calculator.div(a, b));
    }
}
