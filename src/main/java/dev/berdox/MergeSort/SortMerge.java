package dev.berdox.MergeSort;


// Runtime O(nlog n)

public class SortMerge {

    private void merge(int[] array, int begin, int middle, int end) {
        // Find the sizes of two subarrays to be merged
        int sub1 = middle - begin + 1;
        int sub2 = end - middle;

        // Create two temp arrays
        int[] left = new int[sub1];
        int[] right = new int[sub2];

        // Copy data to temp arrays
        for(int i = 0; i < sub1; i++) {
            left[i] = array[begin + i];
        }
        for (int j = 0; j < sub2; j++) {
            right[j] = array[middle + 1 + j];
        }

        // Merge the temp arrays together

        // Initial indexes of left and right sub arrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int subBegin = begin;
        while (i < sub1 && j < sub2) {
            if(left[i] <= right[j]) {
                array[subBegin] = left[i];
                i++;
            } else {
                array[subBegin] = right[j];
                j++;
            }
            subBegin++;
        }

        // Copy remaining elements of Left[] if any
        while (i < sub1) {
            array[subBegin] = left[i];
            i++;
            subBegin++;
        }

        // Copy remaining elements of right[] if any
        while (j < sub2) {
            array[subBegin] = right[j];
            j++;
            subBegin++;
        }

    }

    public void sort(int[] array, int begin, int end) {
        if(begin < end) {
            // Find the middle point
            int middle = begin + (end - begin)/2;

            // sort first and second half
            sort(array, begin, middle);
            sort(array, middle + 1, end);

            // merge the sorted halves
            merge(array, begin, middle, end);
        }
    }
}
