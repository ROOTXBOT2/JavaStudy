package Algorhythm.Queue;

/**
 * @author rua
 */
public class MyQueue { // 원형 큐 구현
    private int[] data;
    private int front; // 데이터를 꺼낼 위치(dequeue)
    private int rear; // 데이터를 집어넣을 위치(enqueue)
    private int size; // 현재 큐에 저장된 원소 개수(꽉 찼는지 확인용)

    public MyQueue(int capacity) {
        data = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == data.length) {
            throw new RuntimeException("큐가 가득 찼습니다.");
        }
        data[rear] = value;
        rear = (rear + 1) % data.length; // 원형 구조
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("큐가 비었습니다.");
        }
        int value = data[front];
        front = (front + 1) % data.length;
        size--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("큐가 비었습니다.");
        }
        return data[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
