package Algorhythm.Sort;

/**
 * @author rua
 */
public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {5, 3, 8, 4, 2, 7, 1, 10};
        mergeSorting(arr,0,arr.length-1);
        for (int n : arr) System.out.print(n + " ");
    }

    public static void mergeSorting(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left  + (right - left) / 2;
        mergeSorting(arr, left, mid);
        mergeSorting(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1]; // 2
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (int p = 0; p < temp.length; p++) {
            arr[left + p] = temp[p];
        }
    }
}

