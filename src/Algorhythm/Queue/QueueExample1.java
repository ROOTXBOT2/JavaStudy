package Algorhythm.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author rua
 */
public class QueueExample1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int N = sc.nextInt();

        // 1~N까지 카드를 큐에 넣음
        for (int i = 1; i <= N; i++) {
            myQueue.add(i);
        }

        // 카드가 1장 남을 때까지 반복
        while (myQueue.size() > 1) {
            myQueue.poll();                      // 맨 위 카드 버림
            myQueue.add(myQueue.poll());         // 다음 카드를 맨 아래로 이동
        }

        System.out.println(myQueue.poll());      // 마지막 남은 카드 출력
    }
}
