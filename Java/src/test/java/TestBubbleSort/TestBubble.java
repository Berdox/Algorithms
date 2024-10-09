package TestBubbleSort;


import dev.berdox.Algorithm.BubbleSort.BubbleSort;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TestBubble {
    @Test
    public void testBubble() {
        int[] a = {38, 50, 2, 5, 20};
        int[] result = {50, 38, 20, 5, 2};
        int[] b = BubbleSort.bubbleSort(a, false);
        assertArrayEquals(result, b);

        int[] result2 = {2, 5, 20, 38, 50};
        int[] c = BubbleSort.bubbleSort(a, true);
        assertArrayEquals(result2, c);
    }
}
