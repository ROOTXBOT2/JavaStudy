package Algorhythm.Sort;

/**
 * @author rua
 */
public class MergeSortEx1 {
    public static void main(String[] args) {
        int [] arr = {5, 3, 8, 4, 2, 7, 1, 10};

    }
    public static void mergeSorting(int[] arr, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;

        mergeSorting(arr, left, mid);
        mergeSorting(arr,mid+1,right);

    }
    public static void merging(int[] arr, int left, int mid, int right) {
        
    }
}
