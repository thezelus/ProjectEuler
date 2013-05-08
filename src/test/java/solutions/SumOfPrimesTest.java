package solutions;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class SumOfPrimesTest {

    SumOfPrimes sumOfPrimes = new SumOfPrimes();

    @Test
    public void testSumOfPrimeNumbers() throws Exception {
        long sum = sumOfPrimes.sumOfPrimeNumbers(10);
        assertEquals(17, sum);
    }

    @Test
    public void testSumOfPrimeNumbersEratosthenes() throws Exception {
        long sum = sumOfPrimes.sumOfPrimeNumbersEratosthenes(10);
        assertEquals(17, sum);
    }

    @Test
    public void testSeiveOfEratosthenes_returnsListOfPrimeNumbers()
    {
        List<Long> actualListOfPrimeNumbers = sumOfPrimes.seiveOfEratosthenes(15);

        assertEquals("Compare length of list", 6, actualListOfPrimeNumbers.size());

        assertEquals("First number", (Object) 2L, actualListOfPrimeNumbers.get(0));
        assertEquals("Second number", (Object) 3L, actualListOfPrimeNumbers.get(1));
        assertEquals("Third number", (Object) 5L, actualListOfPrimeNumbers.get(2));
        assertEquals("Fourth number", (Object) 7L, actualListOfPrimeNumbers.get(3));
        assertEquals("Fifth number", (Object) 11L, actualListOfPrimeNumbers.get(4));
        assertEquals("Sixth number", (Object) 13L, actualListOfPrimeNumbers.get(5));
    }


}
