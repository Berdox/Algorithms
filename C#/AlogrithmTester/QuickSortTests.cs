using NUnit.Framework;
using NUnit.Framework.Legacy;
using QuickSortAlgorithm;

namespace AlogrithmTester {
    public class QuickSortTests {

        QuickSort _quickSort;

        [SetUp]
        public void Setup() {
            _quickSort = new QuickSort();
        }

        [TearDown]
        public void TearDown() {
        }

        [Test]
        public void QuickSortTest() {
            int[] arr = { 4, 7, 8, 3, 1, 0};
            int[] result = { 0, 1, 3, 4, 7, 8 };
            ClassicAssert.AreEqual(result, _quickSort.quickSort(arr, 0 , arr.Length - 1));
        }
    }
}