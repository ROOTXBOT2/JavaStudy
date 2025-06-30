package Algorhythm.Sort;

/**
 * @author rua
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6, 4, 1, 7, 3, 9, 8};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];       // 현재 삽입할 값
            int j = i - 1;

            // 정렬된 앞 부분에서 key보다 큰 값을 한 칸씩 뒤로 밀기
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // 적절한 위치에 key 삽입

            // 출력
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println(" ");
        }

    }
}
