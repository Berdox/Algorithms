package TestMergeSort;

import dev.berdox.Algorithm.MergeSort.MergeSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class TestMerge {
    @Test
    public void testSort() {
        int[] a = {38, 27, 43, 3, 9, 82, 10};
        int[] result = {3,9,10,27,38,43,82};
        assertArrayEquals(result, MergeSort.sort(a, 0, a.length-1));
    }
}