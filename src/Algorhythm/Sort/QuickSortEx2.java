package Algorhythm.Sort;

/**
 * @author rua
 */
public class QuickSortEx2 {
    public static void main(String[] args) {
        int [] arr = {5, 3, 8, 4, 2, 7, 1, 10};

        quickSort(arr, 0, arr.length-1);

        for (int n : arr) System.out.print(n + " ");
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;
        // 중간값을 pivot으로 사용
        int pivotIndex = left + (right - left) / 2;
        int pivot = arr[pivotIndex];

        int i = left;
        int j = right;

        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;

            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        quickSort(arr, left, j);   // 왼쪽 파티션
        quickSort(arr, i, right);  // 오른쪽 파티션
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
