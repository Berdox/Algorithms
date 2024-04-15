package dev.berdox.BubbleSort;


// bubble sort is a basic sorting algorithm where it will check to see if the next
// element is bigger then the previous element, if so then swap. This will go through
// the array until there is no more swaps
// Runtime O(n^2)
public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        int size = arr.length;
        boolean swapped;
        for(int i = 0; i < size - 1; i++) {
            swapped = false;
            for(int j = 0; j < size - i - 1; j++) {
                if(arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) {
                break;
            }
        }
        return arr;
    }
}
