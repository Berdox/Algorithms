package dev.berdox.Algorithm.BinarySearch;

// A divide and conquer algorithm
// It will sort the incoming array into ascending order then do binary search on it.
// This works by checking the middle index of an array and seeing if that number is
// smaller or bigger than the target number and split the array accord
// Runtime O(log n)
public class BinarySearch {

    /**
     * Binary Search is divide and conquer algorithm and is an efficient algorithm for finding an item from a sorted list
     * by repeatedly dividing the search interval in half.
     *
     * Prerequisite:
     * Sorted Array or List
     *
     * Time Complexity:
     * - Best Case: O(1) - when the target element is found at the middle of the array
     * - Average Case: O(log n) - when the target element is somewhere in the middle of the array
     * - Worst Case: O(log n) - when the target element is not in the array
     *
     * Space Complexity:
     * - O(1) - Binary Search is an iterative algorithm, meaning it uses only a constant amount of extra memory.
     *
     * @param array the sorted integer array to search in
     * @param tar   the target integer to search for
     * @return the index of the target integer if found, otherwise -1
     */
    public static int BinSearch(int[] array, int tar) {
        int begin = 0;           // Starting index of the array
        int end = array.length - 1;  // Ending index of the array

        // Loop until the begin index is less than or equal to the end index
        while(begin <= end) {
            int middle = begin + (end - begin) / 2;  // Calculate the middle index

            // If the middle element is equal to the target, return its index
            if(array[middle] == tar) {
                return middle;
            }
            // If the middle element is less than the target, update the begin index
            else if (array[middle] < tar) {
                begin = middle + 1;
            }
            // If the middle element is greater than the target, update the end index
            else {
                end = middle - 1;
            }
        }

        // If the target is not found in the array, return -1
        return -1;
    }
}
