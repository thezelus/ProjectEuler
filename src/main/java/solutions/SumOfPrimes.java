package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SumOfPrimes {

    //sumOfPrimes
    public long primaryMethod(Integer limit)
    {
        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
        long sum = 0;
        for(long i = 2 ; i<limit; i++)
        {
            if(primeNumberFinder.primalityTester(i))
                sum+=i;
        }

        return sum;
    }


    public long sumOfPrimeNumbersEratosthenes(int limit)
    {
        long sum = 0;

        List<Long> listOfPrimeNumbers = seiveOfEratosthenes(limit);

        for(Long x: listOfPrimeNumbers)
        {
            sum = sum+x;
        }

        return sum;
    }

    List<Long> seiveOfEratosthenes(long limit)
    {
        List<Long> primeNumberList = new ArrayList<Long>();

        for(long i = 2; i<limit; i++)
            primeNumberList.add(i);

        int index = 0;
        long temp = primeNumberList.get(index);
        ListIterator<Long> iterator;
        long nextValue;

        while (temp < primeNumberList.get(primeNumberList.size()-1))
        {
            iterator = primeNumberList.listIterator();

            while (temp>iterator.next());

            while (iterator.hasNext())
            {
                nextValue = iterator.next();
                if(nextValue%temp==0)
                  iterator.remove();
            }

            temp =  primeNumberList.get(++index);
        }

        return primeNumberList;
    }
}
