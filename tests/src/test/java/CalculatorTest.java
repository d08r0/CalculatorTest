import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by scrooge on 21.12.17.
 */
public class CalculatorTest {

    @Test
    public void testCalulationSum() {

        int a = 10;
        int b = 17;

        int result = 27;

        Calculator calculator = new Calculator();

        assertEquals(result, calculator.sum(a, b));
    }

    @Test
    public void testCalulationDiv() {

        int a = 20;
        int b = 10;

        int result = 2;

        Calculator calculator = new Calculator();

        assertEquals(result, calculator.div(a, b));
    }
}
