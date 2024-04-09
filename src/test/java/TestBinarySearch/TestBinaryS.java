package TestBinarySearch;
import dev.berdox.BinarySearch.BinarySearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinaryS {
    @Test
    public void testBinSearch() {
        int[] a = {2, 3, 5, 7, 8, 10, 12, 15, 18, 20};
        BinarySearch bin = new BinarySearch();
        assertEquals(bin.BinSearch(a, 20), 9);
        assertEquals(bin.BinSearch(a, 2), 0);
        assertEquals(bin.BinSearch(a, 200), -1);
        assertEquals(bin.BinSearch(a, -100), -1);
   }
}
