package TestQuickSort;

import dev.berdox.QuickSort.SortQuick;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class testQuick {
    @Test
    public void testSort() {
        int[] a = {10, 7, 8, 9, 1, 5};
        SortQuick quick = new SortQuick();
        quick.quickSort(a, 0, a.length - 1);
        int[] result = {1, 5, 7, 8, 9, 10};
        assertArrayEquals(result, a);
    }
}
