package solutions;

import java.math.BigInteger;

public class PowerDigitSum {



    public long primaryMethod(Integer power){
        BigInteger number = calculateNumber(power);
        long sum = calculateDigitSum(number);
        return sum;
    }


    long calculateDigitSum(BigInteger number) {
        BigInteger sum = BigInteger.ZERO;
        while (number.compareTo(BigInteger.valueOf(9))>0) {
            sum = sum.add(number.remainder(BigInteger.TEN));
            number = number.divide(BigInteger.TEN);
        }
        return (sum.add(number).longValue());
    }

    BigInteger calculateNumber(int power) {
        /*if (power == 0)
            return BigInteger.valueOf(1);
        else {
            return (calculateNumber(power - 1).multiply(BigInteger.valueOf(2)));
        }*/
        return BigInteger.valueOf(2).pow(power);
    }


}
