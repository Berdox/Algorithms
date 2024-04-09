package TestMergeSort;

import dev.berdox.MergeSort.SortMerge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestMerge {
    @Test
    public void testSort() {
        int[] a = {38, 27, 43, 3, 9, 82, 10};
        SortMerge sort = new SortMerge();
        int[] result = {3,9,10,27,38,43,82};
        sort.sort(a, 0, a.length - 1);
        assertArrayEquals(result, a);
    }
}