package dev.berdox.Algorithm.QuickSort;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        QuickSort quick = new QuickSort();
        quick.quickSort(array, 0, array.length - 1);
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
