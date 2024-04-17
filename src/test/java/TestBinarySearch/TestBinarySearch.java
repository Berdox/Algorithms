package TestBinarySearch;
import dev.berdox.Algorithm.BinarySearch.BinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestBinarySearch {
    @Test
    public void testBinSearch() {
        int[] a = {2, 3, 5, 7, 8, 10, 12, 15, 18, 20};
        assertEquals(BinarySearch.BinSearch(a, 20), 9);
        assertEquals(BinarySearch.BinSearch(a, 2), 0);
        assertEquals(BinarySearch.BinSearch(a, 200), -1);
        assertEquals(BinarySearch.BinSearch(a, -100), -1);
   }
}
