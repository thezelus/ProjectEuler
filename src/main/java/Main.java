import solutions.PrimeNumberFinder;

public class Main {

    public static void main(String[] args) {

        primeNumberFinder(10001);

    }

    public static void primeNumberFinder(int index)
    {
        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
        long primeNumberAtIndex;

        long startTime = System.nanoTime();
        primeNumberAtIndex = primeNumberFinder.findPrimeNumber(index);
        long endTime = System.nanoTime();

        System.out.println("Prime number at the index " + Integer.toString(primeNumberFinder.primeNumberIndex) + " is "+Long.toString(primeNumberAtIndex));
        System.out.println("Time required for this computation is " + Long.toString((endTime-startTime)/1000000));

    }


}
