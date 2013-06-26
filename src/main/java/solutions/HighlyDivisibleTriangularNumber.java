package solutions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class HighlyDivisibleTriangularNumber {

    long triangularNumber;

    public long findTriangularNumber(int minNumberOfDivisors)
    {
        int numberOfDivisors = 1;
        long triangularNumberIndex = 0;
        long triangularNumber = 0;

        while(numberOfDivisors < minNumberOfDivisors)
        {
            triangularNumberIndex++;
            triangularNumber = generateTriangularNumber(triangularNumberIndex, triangularNumber);
            numberOfDivisors = findNumberOfDivisors(triangularNumber);
            System.out.println("Number - " + Long.toString(triangularNumber) + "   Index - " + Long.toString(triangularNumberIndex) + "   Divisors - " + Integer.toString(numberOfDivisors));
        }
        return triangularNumber;
    }

    long generateTriangularNumber(long index, long lastTriangularNumber) {
        return (index + lastTriangularNumber);
    }

    int findNumberOfDivisors(long triangularNumber) {
        int count = 0;
        for(long i = 1; i<=Math.sqrt(triangularNumber); i++)
        {
            if(triangularNumber % i == 0)
                count++;
        }
        return 2*count;
    }
}
