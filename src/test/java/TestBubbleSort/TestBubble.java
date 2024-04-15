package TestBubbleSort;


import dev.berdox.BubbleSort.BubbleSort;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestBubble {
    @Test
    public void testBubble() {
        int[] a = {38, 50, 2, 5, 20};
        int[] result = {50, 38, 20, 5, 2};
        int[] b = BubbleSort.bubbleSort(a);
        assertArrayEquals(result, b);
    }
}
