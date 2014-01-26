package solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class LongestCollatzSequence {

    long number = 1, maxChainLength = 0;

    public long primaryMethod(Long upperLimit)
    {
        if(upperLimit ==0)
            return 0;
        else if(upperLimit ==2)
            return 2;
        long limit = (upperLimit%2==0)?(upperLimit-1):(upperLimit);
        for(long i = 1; i<=limit; i=i+2)
        {
            long tempChainLength = findChainLength(i);
            System.out.println(Long.toString(i)+"  "+Long.toString(tempChainLength));
            if(maxChainLength<tempChainLength)
                {
                    number=i;
                    maxChainLength = tempChainLength;
                }
        }
        return number;
    }

    long findChainLength(long startingPoint) {
        long length = 1, nextElement = startingPoint;
        while(nextElement != 1)
        {
            if(nextElement%2==0)
                nextElement=nextElement/2;
            else
                nextElement=3*nextElement+1;
            length++;
        }
        return length;
    }

}
