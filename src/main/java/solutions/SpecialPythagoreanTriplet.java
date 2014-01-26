package solutions;

public class SpecialPythagoreanTriplet {

    public int primaryMethod(Integer sum)
    {   //product of the triplets given the sum
        int i, j, k;
        i = 1;
        j = sum;
        while(i<j)
        {
            k = sum-i-j;
            if(i*i+j*j < k*k)
            {
                i++;
            }
            else if(i*i+j*j > k*k)
            {
                j--;
            }
            else if(i*i+j*j == k*k)
            {
                return i*j*k;
            }
        }

        return -1;
    }
}
