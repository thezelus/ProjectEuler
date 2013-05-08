import solutions.LargestProductInASeries;
import solutions.PrimeNumberFinder;
import solutions.SpecialPythagoreanTriplet;
import solutions.SumOfPrimes;

public class Main {

    public static void main(String[] args) {

        //primeNumberFinder(10001);
        //largestProduct();
        //pythagoreanTriplet(1000);
        sumOfPrimes(2000000);
    }

    public static void primeNumberFinder(int index)
    {
        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
        long primeNumberAtIndex;

        long startTime = System.nanoTime();
        primeNumberAtIndex = primeNumberFinder.findPrimeNumber(index);
        long endTime = System.nanoTime();

        System.out.println("Prime number at the index " + Integer.toString(primeNumberFinder.primeNumberIndex) + " is "+Long.toString(primeNumberAtIndex));
        System.out.println("Time required for this computation in milliseconds is " + Long.toString((endTime-startTime)/1000000));

    }

    public static void largestProduct()
    {
        LargestProductInASeries largestProductInASeries = new LargestProductInASeries();
        int largestProduct;

        long startTime = System.nanoTime();
        largestProduct = largestProductInASeries.getLargestProduct(largestProductInASeries.series);
        long endTime = System.nanoTime();

        System.out.println("Largest Product in the series is " + Integer.toString(largestProduct));
        System.out.println("Time required for this computation is in milliseconds is " + Long.toString((endTime-startTime)/1000000));

    }

    public static void pythagoreanTriplet(int sum)
    {
        SpecialPythagoreanTriplet specialPythagoreanTriplet = new SpecialPythagoreanTriplet();
        int product;

        long startTime = System.nanoTime();
        product = specialPythagoreanTriplet.productOfSpecial(sum);
        long endTime = System.nanoTime();

        System.out.println("Product of the triplets is " + Integer.toString(product));
        System.out.println("Time required for this computation is in milliseconds is " + Long.toString((endTime-startTime)/1000000));
    }

    public static void sumOfPrimes(int limit)
    {
        SumOfPrimes sumOfPrimes = new SumOfPrimes();
        long sum;

        long startTime = System.nanoTime();
        sum = sumOfPrimes.sumOfPrimeNumbers(limit);
        long endTime = System.nanoTime();

        System.out.println("Sum of primes less than " + Integer.toString(limit) +" is " + Long.toString(sum));
        System.out.println("Time required for this computation is in milliseconds is " + Long.toString((endTime-startTime)/1000000));
    }


}
