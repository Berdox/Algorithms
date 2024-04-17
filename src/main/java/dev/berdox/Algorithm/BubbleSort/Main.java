package dev.berdox.Algorithm.BubbleSort;

public class Main {
    public static void main(String[] arg) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        int[] arr2 = BubbleSort.bubbleSort(arr, true);
        System.out.println("Sorted array");
        for(var i : arr2) {
            System.out.println(i + " ");
        }
    }
}
