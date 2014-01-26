package solutions;

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LongestCollatzSequenceTest {

    LongestCollatzSequence collatzSequence = new LongestCollatzSequence();

    @Test
    public void testGetStartPointForLongestCollatzSequence() throws Exception {
        assertEquals(0L, collatzSequence.primaryMethod((Long.valueOf(0))));
        /*
        assertEquals(1L, collatzSequence.primaryMethod(1));
        assertEquals(2L, collatzSequence.primaryMethod(2));
        assertEquals(3L, collatzSequence.primaryMethod(3));
        assertEquals(3L, collatzSequence.primaryMethod(4));
        assertEquals(3L, collatzSequence.primaryMethod(5));
         */
    }

    @Test
    public void testFindChainLength() throws Exception {
        assertEquals(collatzSequence.findChainLength(13), 10);
        assertEquals(collatzSequence.findChainLength(1), 1);
    }
}
