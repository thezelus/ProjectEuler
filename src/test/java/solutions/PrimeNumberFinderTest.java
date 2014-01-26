package solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeNumberFinderTest {

    PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();

    @Test
    public void testPrimalityTester() throws Exception {

        assertEquals(true, primeNumberFinder.primalityTester(7L));
        assertEquals(true, primeNumberFinder.primalityTester(11L));
        assertEquals(false, primeNumberFinder.primalityTester(12L));
    }

    @Test
    public void testFindPrimeNumber() throws Exception {
        assertEquals(11, primeNumberFinder.primaryMethod(5));
    }
}
