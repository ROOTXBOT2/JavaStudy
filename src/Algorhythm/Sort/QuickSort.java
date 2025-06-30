package Algorhythm.Sort;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right, int depth) {
        printIndent(depth);
        System.out.println("🔁 quickSort(left=" + left + ", right=" + right + ") 호출");

        if (left >= right) {
            printIndent(depth);
            System.out.println("🛑 left >= right → 리턴");
            return;
        }

        int pivot = arr[(left + right) / 2];
        int l = left;
        int r = right;

        printIndent(depth);
        System.out.println("📌 pivot 선택: " + pivot + " (arr[" + ((left + right) / 2) + "])");

        while (l <= r) {
            while (arr[l] < pivot) {
                printIndent(depth);
                System.out.println("➡️ arr[" + l + "]=" + arr[l] + " < pivot=" + pivot + " → l++");
                l++;
            }

            while (arr[r] > pivot) {
                printIndent(depth);
                System.out.println("⬅️ arr[" + r + "]=" + arr[r] + " > pivot=" + pivot + " → r--");
                r--;
            }

            if (l <= r) {
                printIndent(depth);
                System.out.println("🔄 swap: arr[" + l + "]=" + arr[l] + " ↔ arr[" + r + "]=" + arr[r]);
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
                printIndent(depth);
                System.out.println("📌 현재 배열 상태: " + Arrays.toString(arr));
            }
        }

        printIndent(depth);
        System.out.println("📂 왼쪽 분할 정렬: left=" + left + " ~ r=" + r);
        quickSort(arr, left, r, depth + 1);

        printIndent(depth);
        System.out.println("📂 오른쪽 분할 정렬: l=" + l + " ~ right=" + right);
        quickSort(arr, l, right, depth + 1);
    }

    public static void main(String[] args) {
        int[] arr = {7, 3, 5, 9, 1, 4, 8};
        System.out.println("정렬 전: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1, 0);
        System.out.println("정렬 후: " + Arrays.toString(arr));
    }

    // depth 만큼 들여쓰기
    private static void printIndent(int depth) {
        for (int i = 0; i < depth; i++) System.out.print("  ");
    }
}
