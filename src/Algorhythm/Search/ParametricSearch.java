package Algorhythm.Search;

/**
 * @author rua
 */
public class ParametricSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
        System.out.println(solution(arr,4));
    }
    public static int solution(int[] stones, int k) {
        int left = 1;                  // 최소 1명부터 가능성 있음
        int right = 200_000_000;      // 문제 조건상 최대 stone 값 = 2억
        int answer = 0;

        while (left <= right) {
            int mid = (left + right) / 2; // 현재 탐색 중인 사람 수(mid)

            if (canCross(stones, k, mid)) {
                answer = mid;        // mid명이 건널 수 있다면 정답 후보 저장
                left = mid + 1;      // 더 많은 사람이 가능할지도?
            } else {
                right = mid - 1;     // mid명도 불가능 → 더 적은 수로 좁힘
            }
        }
        return answer;
    }
    public static boolean canCross(int[] stones, int k, int people) {
        int skip = 0;
        for (int stone : stones) {
            if (stone - people < 0) {
                skip++;
                if (skip >= k) return false;
            } else {
                skip = 0;
            }
        }
        return true;
    }
}
