package Algorhythm.Sort;

public class QuickSortEx1 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        int n = 1;  // 정렬 기준이 되는 인덱스

        // 퀵 정렬 호출 (중간 요소 pivot 방식)
        quickSort(strings, 0, strings.length - 1, n);

        // 결과 출력
        for (String s : strings) {
            System.out.println(s);
        }
    }

    // 퀵 정렬 재귀 함수
    private static void quickSort(String[] arr, int left, int right, int n) {
        if (left < right) {
            int pivotPos = partition(arr, left, right, n); // {"sun", "bed", "car"}, 0, 2, 1 ->
            quickSort(arr, left, pivotPos - 1, n);
            quickSort(arr, pivotPos + 1, right, n);
        }
    }

    // 파티션: 중간 요소를 pivot으로 삼고, 마지막 위치로 옮겨 분할 수행
    private static int partition(String[] arr, int left, int right, int n) {
        // 1) 중간 인덱스 계산
        int mid = left + (right - left) / 2;
        // 2) mid 요소를 임시로 끝으로 스왑
        swap(arr, mid, right);

        // 3) 이제 끝(arr[right])이 pivot 값
        String pivot = arr[right];
        int i = left - 1; // -1

        // 4) left..right-1 구간을 순회하며 pivot과 비교
        for (int j = left; j < right; j++) {
            if (compare(arr[j], pivot, n) <= 0) {
                i++;
                swap(arr, i, j);
            }
        }

        // 5) pivot을 i+1 위치로 보내서 분할 완료
        swap(arr, i + 1, right);
        return i + 1;
    }

    // 두 문자열을 n번째 문자 기준으로 비교
    // a가 b보다 '작거나 같으면' 음수/0, 크면 양수 반환
    private static int compare(String a, String b, int n) {
        char ca = a.charAt(n);
        char cb = b.charAt(n);
        if (ca != cb) {
            return ca - cb;           // n번째 문자 오름차순
        }
        return a.compareTo(b);        // 같으면 전체 문자열 사전순
    }

    // 배열 요소 스왑 유틸
    private static void swap(String[] arr, int i, int j) {
        String tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
