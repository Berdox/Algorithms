package dev.berdox.Algorithm.QuickSort;

// A divide and conquer algorithm
// Quick sort use a pivot to
// Runtime O(n^2)

public class QuickSort {

    /**
     * Quick Sort is a divide-and-conquer algorithm that partitions the array into two halves,
     * recursively sorts each half, and combines them to achieve the sorted array.
     *
     * Time Complexity:
     * - Best Case: O(n log n) - when the partitioning is balanced
     * - Average Case: O(n log n)
     * - Worst Case: O(n^2) - when the partitioning is highly unbalanced
     *
     * Space Complexity:
     * - O(log n) - for the recursive call stack
     */

    /**
     * Swaps two elements in an integer array.
     *
     * @param array the integer array
     * @param i     the index of the first element to swap
     * @param j     the index of the second element to swap
     */
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Partitions the array based on a pivot element.
     * All elements less than the pivot are moved to its left,
     * and all elements greater than or equal to the pivot are moved to its right.
     *
     * @param array the integer array to partition
     * @param low   the starting index of the partition
     * @param high  the ending index of the partition
     * @return the index of the pivot element after partitioning
     */
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];  // Choose the pivot element as the last element
        int i = (low - 1);  // Initialize the index of smaller element

        // Iterate through the array from low to high-1
        for(int j = low; j <= high - 1; j++) {
            // If current element is smaller than the pivot
            if(array[j] < pivot) {
                i++;  // Increment index of smaller element
                swap(array, i, j);  // Swap array[i] and array[j]
            }
        }
        swap(array, i + 1, high);  // Swap array[i + 1] and array[high] (pivot)
        return (i + 1);  // Return the partitioning index
    }

    /**
     * Recursive function to perform quick sort on an integer array.
     *
     * @param array the integer array to sort
     * @param low   the starting index of the array or subarray to sort
     * @param high  the ending index of the array or subarray to sort
     * @return the sorted integer array
     */
    public static int[] quickSort(int[] array, int low, int high) {
        if(low < high) {
            int pi = partition(array, low, high);  // Partition the array
            // Recursively sort elements before partition and after partition
            quickSort(array, low, pi-1);
            quickSort(array, pi + 1, high);
        }
        return array;
    }
}


