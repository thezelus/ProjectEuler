package solutions;

import org.junit.Test;

import java.math.BigInteger;

import static junit.framework.Assert.assertEquals;


public class PowerDigitSumTest {

    @Test
    public void testCalculateNumber() throws Exception {

        PowerDigitSum powerDigitSum = new PowerDigitSum();
        int testPower = 8;
        BigInteger actualNumber = powerDigitSum.calculateNumber(testPower);

        assertEquals(BigInteger.valueOf(256), actualNumber);
    }

    @Test
    public void testCalculateDigitSum() throws Exception{

        PowerDigitSum powerDigitSum = new PowerDigitSum();
        BigInteger testNumber = BigInteger.valueOf(10);
        long expectedSum = 1L;
        long actualSum = powerDigitSum.calculateDigitSum(testNumber);

        assertEquals(expectedSum, actualSum);
    }

}
