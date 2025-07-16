package Algorhythm.Euclidean;

/**
 * @author rua
 */
public class Euclidean1 {
    public static int Euclidean1(int a, int b) {
        if (b == 0) return a;
        return Euclidean1(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(Euclidean1(16, 32));
    }
}