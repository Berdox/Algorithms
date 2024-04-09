package dev.berdox.BinarySearch;

// It will sort the incoming array into ascending order then do binary search on it.
// This works by checking the middle index of an array and seeing if that number is
// smaller or bigger than the target number and split the array acroundly

public class BinarySearch {
    // Will do binary search and will return the index of it
    // but if not found will return -1
    public int BinSearch(int[] array, int tar) {
        int begin = 0;
        int end = array.length - 1;

        while(begin <= end) {
            int middle = begin + (end - begin)/2;
            if(array[middle] == tar) {
                return middle;
            } else if (array[middle] < tar){
                begin = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1;
    }
}
