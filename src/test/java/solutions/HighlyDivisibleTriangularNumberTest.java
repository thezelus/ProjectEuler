package solutions;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class HighlyDivisibleTriangularNumberTest {

    HighlyDivisibleTriangularNumber testHighlyDivisibleTriangularNumber = new HighlyDivisibleTriangularNumber();

    @Test
    public void testFindTriangularNumber() throws Exception {
        assertEquals(testHighlyDivisibleTriangularNumber.primaryMethod(4), 6);
        assertEquals(testHighlyDivisibleTriangularNumber.primaryMethod(5), 28);
    }

    @Test
    public void testFindNumberOfDivisors() throws Exception {
        assertEquals(testHighlyDivisibleTriangularNumber.findNumberOfDivisors(10L), 4);
        assertEquals(testHighlyDivisibleTriangularNumber.findNumberOfDivisors(28L), 6);
    }
}
