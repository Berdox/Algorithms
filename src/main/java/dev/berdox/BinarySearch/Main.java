package dev.berdox.BinarySearch;
public class Main {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 7, 8, 10, 12, 15, 18, 20};
        BinarySearch bin = new BinarySearch();
        int result = bin.BinSearch(a, 3);
        System.out.println(result);
    }
}
