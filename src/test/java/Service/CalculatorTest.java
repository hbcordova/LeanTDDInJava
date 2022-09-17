package Service;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testSum() {
        // Arrange
        Calculator calculator = new Calculator();

        //Act
        double result = Calculator.sum(5, 2);
        double expected = 7;

        //Assert
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testRest() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        double result = Calculator.rest(5, 2);
        double expected = 3;

        // Assert
        Assert.assertEquals(expected, result);
    }
}