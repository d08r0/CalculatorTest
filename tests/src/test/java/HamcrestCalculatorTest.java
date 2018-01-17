import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by scrooge on 15.01.18.
 */
public class HamcrestCalculatorTest {

    @Test
    public void testCalulationSum() {

        int a = 10;
        int b = 17;

        int result = 27;

        Calculator calculator = new Calculator();

        assertThat("Ожидали другой результат",calculator.sum(a, b), equalTo(result));
    }

    @Test
    public void testCalulationDiv() {

        int a = 20;
        int b = 10;

        int result = 2;

        Calculator calculator = new Calculator();

        assertThat("Ожидали другой результат",calculator.div(a, b), equalTo(result));
    }
}
