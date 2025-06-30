package Algorhythm.Queue;

/**
 * @author rua
 */
public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("peek: " + queue.peek());   // 10
        System.out.println("dequeue: " + queue.dequeue()); // 10
        System.out.println("dequeue: " + queue.dequeue()); // 20

        queue.enqueue(40);
        System.out.println("peek: " + queue.peek());   // 30
        System.out.println("size: " + queue.size());   // 2
    }
}
