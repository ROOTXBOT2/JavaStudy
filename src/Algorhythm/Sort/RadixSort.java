package Algorhythm.Sort;

import java.util.Arrays;

/**
 * @author rua
 */

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();

        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }

    private static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // 0~9 버킷

        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] = count[i] + count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            // 현재 숫자에서 exp 자릿수의 값을 뽑음 (예: 1의 자리, 10의 자리 등)
            int digit = (arr[i] / exp) % 10;

            // count[digit]은 이 자릿수에 해당하는 값이 output[]에서 들어갈 다음 위치
            // -1 하는 이유는 배열이 0부터 시작하니까
            int position = count[digit] - 1;

            // 그 위치에 현재 숫자를 삽입
            output[position] = arr[i];

            // 다음 같은 자릿수의 숫자가 들어갈 위치를 앞당김
            count[digit]--;
        }

        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }
}
