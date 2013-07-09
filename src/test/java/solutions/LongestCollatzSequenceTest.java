package solutions;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LongestCollatzSequenceTest {

    LongestCollatzSequence collatzSequence = new LongestCollatzSequence();

    @Test
    public void testGetStartPointForLongestCollatzSequence() throws Exception {
        assertEquals(0L, collatzSequence.getStartPointForLongestCollatzSequence(0));
        assertEquals(1L, collatzSequence.getStartPointForLongestCollatzSequence(1));
        assertEquals(2L, collatzSequence.getStartPointForLongestCollatzSequence(2));
        assertEquals(3L, collatzSequence.getStartPointForLongestCollatzSequence(3));
        assertEquals(3L, collatzSequence.getStartPointForLongestCollatzSequence(4));
        assertEquals(3L, collatzSequence.getStartPointForLongestCollatzSequence(5));
    }

    @Test
    public void testFindChainLength() throws Exception {
        assertEquals(collatzSequence.findChainLength(13), 10);
        assertEquals(collatzSequence.findChainLength(1), 1);
    }
}
