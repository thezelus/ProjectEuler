package solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestProductInASeriesTest {
    @Test
    public void testGetLargestProduct() throws Exception {

        LargestProductInASeries largestProductInASeriesTest = new LargestProductInASeries();
        int largestProductActual = largestProductInASeriesTest.getLargestProduct("123451234512345");

        assertEquals(120, largestProductActual);
    }
}
