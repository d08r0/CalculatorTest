import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * Created by scrooge on 15.01.18.
 */
public class AssertJCalculatorTest {

        @Test
        public void testCalulationSum() {

            Calculator calculator = new Calculator();
            int a = 10;
            int b = 17;

            int result = 27;

            assertThat(calculator.sum(a, b)).isEqualTo(result);
        }

    @Test
    public void testCalulationDiv() {

        Calculator calculator = new Calculator();
        int a = 20;
        int b = 10;

        int result = 2;

        assertThat(calculator.div(a, b)).isEqualTo(result);
    }
}
