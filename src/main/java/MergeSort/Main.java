package MergeSort;

public class Main {

    public static void main(String [] args) {
        int[] a = {38, 27, 43, 3, 9, 82, 10};
        SortMerge sort = new SortMerge();
        sort.sort(a, 0, a.length - 1);
        System.out.println("Print array after sort");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
