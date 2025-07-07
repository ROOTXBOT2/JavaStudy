package Algorhythm.Search;


/**
 * @author rua
 */
public class BinarySearch {
    public static void main(String[] args) {
        int [] lessons = {1,2,3,4,5,6,7,8,9};
        int N = 3;
        int answer = 0;
        int left = lessons[lessons.length - 1];
        int right = 0;
        int mid = 0;
        for (int i = 0; i < lessons.length; i++) {
            right += lessons[i];
        }

        while (left <= right) {
            mid = (left + right) / 2;

            if (check(mid, N, lessons)) {
                // mid 크기로 가능하네 → 더 줄여보자
                answer = mid;
                right = mid - 1;
            } else {
                // mid 크기로는 안 되네 → 더 키워야 함
                left = mid + 1;
            }
        }
        System.out.println(answer);

    }
    public static boolean check(int mid, int N,int [] lessons){
        int count = 1;
        int sum = 0;
        for( int lesson : lessons){
            if(sum +lesson > mid){
                count++;
                sum = lesson;
            } else {
                sum += lesson;
            }
        }
        return count <=N;
    }
}
