package dev.berdox.Algorithm.BubbleSort;

public class BubbleSort {

    /**
     * Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
     * compares adjacent elements, and swaps them if they are in the wrong order.
     *
     * Time Complexity:
     * - Best Case: O(n) - when the list is already sorted
     * - Average Case: O(n^2) - when the list is randomly ordered
     * - Worst Case: O(n^2) - when the list is reverse sorted
     *
     * Space Complexity:
     * - O(1) - Bubble Sort is an in-place sorting algorithm, meaning it doesn't require
     *          any extra memory other than the array itself.
     *
     * @param arr the integer array to be sorted
     * @param ascending a boolean flag indicating whether to sort in ascending (true) or descending (false) order
     * @return the sorted integer array
     */
    public static int[] bubbleSort(int[] arr, boolean ascending) {
        int size = arr.length;  // Get the length of the array
        boolean swapped;  // Flag to check if elements are swapped

        // Outer loop to traverse the array elements
        for(int i = 0; i < size - 1; i++) {
            swapped = false;  // Initialize swapped as false

            // Inner loop to compare adjacent elements and swap if necessary
            for(int j = 0; j < size - i - 1; j++) {

                if(ascending) {
                    // If current element is greater than the next element, swap them
                    if(arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;

                        swapped = true;  // Set swapped to true if elements are swapped
                    }
                } else {
                    // If current element is smaller than the next element, swap them
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                        swapped = true;  // Set swapped to true if elements are swapped
                    }
                }
            }

            // If no elements are swapped in the inner loop, the array is sorted
            // We can break out of the outer loop
            if(!swapped) {
                break;
            }
        }

        return arr;  // Return the sorted array
    }
}
