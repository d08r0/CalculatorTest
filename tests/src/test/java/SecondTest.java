import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by scrooge on 21.12.17.
 */
public class SecondTest {


    @Test
    public void testCalulationDiv() {

        Calculator calculator = new Calculator();
        int a = 20;
        int b = 10;

        int result = 2;

        assertEquals(result,calculator.div(a, b));
    }
}
