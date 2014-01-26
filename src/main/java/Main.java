import solutions.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {

        //benchmarker(new PrimeNumberFinder(), 10001);
        //benchmarker(new LargestProductInASeries(), LargestProductInASeries.series);
        //benchmarker(new SpecialPythagoreanTriplet(), 1000);
        //benchmarker(new SumOfPrimes(), 2000000);
        //benchmarker(new HighlyDivisibleTriangularNumber(), 500);
        //benchmarker(new LongestCollatzSequence(), 1000000L);
        benchmarker(new PowerDigitSum(), 1000);

    }

    public static void benchmarker(Object classObject, Object parameter) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        Method method = classObject.getClass().getMethod("primaryMethod", parameter.getClass());

        long startTime = System.nanoTime();
        Object output = method.invoke(classObject, parameter);
        long endTime = System.nanoTime();

        System.out.println(classObject.getClass().toString() + " is " + output.toString());
        System.out.println("Time required for this computation is in milliseconds is " + Long.toString((endTime - startTime) / 1000000));
    }


}
