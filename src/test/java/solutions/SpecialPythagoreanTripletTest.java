package solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecialPythagoreanTripletTest {
    @Test
    public void testProductOfSpecial() throws Exception {

        SpecialPythagoreanTriplet specialPythagoreanTriplet = new SpecialPythagoreanTriplet();
        assertEquals("3*4*5", (3*4*5), specialPythagoreanTriplet.primaryMethod(12));
        assertEquals("36*77*85", (36*77*85), specialPythagoreanTriplet.primaryMethod(36 + 77 + 85));
    }
}
