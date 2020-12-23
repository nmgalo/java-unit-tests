import ge.edu.btu.CalculatorService;
import ge.edu.btu.impl.CalculatorServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorServiceImplTest {

    private CalculatorService calculatorService;

    @Before
    public void setUp() {
        calculatorService = new CalculatorServiceImpl();
    }

    @Test
    public void should_returnTrue_when_additionIsValid() {
        assertEquals(12, calculatorService.sum(10, 2));
    }

    @Test(expected = ArithmeticException.class)
    public void should_expectException_when_YisIllegal() {
        calculatorService.divide(1, 0);
    }

    @Test
    public void should_returnTrue_when_divisionIsCorrect() {
        assertEquals(5, calculatorService.divide(10, 2));
    }

}
