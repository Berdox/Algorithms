package dev.berdox.Algorithm.MergeSort;

public class MergeSort {

    /**
     * Merge Sort is a divide-and-conquer algorithm that divides the array into two halves,
     * recursively sorts each half, and then merges them to achieve the sorted array.
     *
     * Time Complexity:
     * - Best Case: O(n log n)
     * - Average Case: O(n log n)
     * - Worst Case: O(n log n)
     *
     * Space Complexity:
     * - O(n) - for the temporary arrays used during merging
     */

    /**
     * Merges two subarrays of array[].
     *
     * @param array  the integer array containing the subarrays to be merged
     * @param begin  the starting index of the first subarray
     * @param middle the ending index of the first subarray and the starting index of the second subarray
     * @param end    the ending index of the second subarray
     */
    private static void merge(int[] array, int begin, int middle, int end) {
        // Calculate the sizes of the two subarrays to be merged
        int sub1Size = middle - begin + 1;
        int sub2Size = end - middle;

        // Create temporary arrays to hold the two subarrays
        int[] leftSubarray = new int[sub1Size];
        int[] rightSubarray = new int[sub2Size];

        // Copy data from the original array to the temporary arrays
        for (int i = 0; i < sub1Size; i++) {
            leftSubarray[i] = array[begin + i];
        }
        for (int j = 0; j < sub2Size; j++) {
            rightSubarray[j] = array[middle + 1 + j];
        }

        // Merge the two subarrays into the original array

        // Initial indexes for the left and right subarrays
        int leftIndex = 0, rightIndex = 0;

        // Initial index for the merged subarray in the original array
        int mergedIndex = begin;

        // Compare elements from both subarrays and merge them in sorted order
        while (leftIndex < sub1Size && rightIndex < sub2Size) {
            if (leftSubarray[leftIndex] <= rightSubarray[rightIndex]) {
                array[mergedIndex] = leftSubarray[leftIndex];
                leftIndex++;
            } else {
                array[mergedIndex] = rightSubarray[rightIndex];
                rightIndex++;
            }
            mergedIndex++;
        }

        // Copy any remaining elements from the left subarray
        while (leftIndex < sub1Size) {
            array[mergedIndex] = leftSubarray[leftIndex];
            leftIndex++;
            mergedIndex++;
        }

        // Copy any remaining elements from the right subarray
        while (rightIndex < sub2Size) {
            array[mergedIndex] = rightSubarray[rightIndex];
            rightIndex++;
            mergedIndex++;
        }
    }

    /**
     * Recursive function to perform merge sort on an integer array.
     *
     * @param array the integer array to sort
     * @param begin the starting index of the array or subarray to sort
     * @param end   the ending index of the array or subarray to sort
     * @return the sorted integer array
     */
    public static int[] sort(int[] array, int begin, int end) {
        if(begin < end) {
            // Find the middle point
            int middle = begin + (end - begin)/2;

            // sort first and second half
            sort(array, begin, middle);
            sort(array, middle + 1, end);

            // merge the sorted halves
            merge(array, begin, middle, end);
        }
        return array;
    }
}

