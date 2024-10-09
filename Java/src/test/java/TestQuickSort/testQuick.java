package TestQuickSort;

import dev.berdox.Algorithm.QuickSort.QuickSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class testQuick {
    @Test
    public void testSort() {
        int[] a = {10, 7, 8, 9, 1, 5};
        int[] result = {1, 5, 7, 8, 9, 10};
        assertArrayEquals(result, QuickSort.quickSort(a, 0, a.length-1));
    }
}
