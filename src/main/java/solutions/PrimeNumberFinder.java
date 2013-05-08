package solutions;

public class PrimeNumberFinder {

    public int primeNumberIndex = 0;

    public long findPrimeNumber(int index)
    {
        long number = 1;
        while(primeNumberIndex < index)
        {
            if(primalityTester(++number)==true)
               primeNumberIndex++;
        }
        return number;
    }

    public boolean primalityTester(long number)
    {
        boolean flag = true;
        double squareRoot = Math.sqrt(number);
        loop:
        for(int i = 2; i<=Math.floor(squareRoot); i++)
        {
            if(number%i == 0)
            {
                flag = false;
                break loop;
            }
        }
        return flag;
    }
}
