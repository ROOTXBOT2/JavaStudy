package Algorhythm.EulerPhi;

/**
 * @author rua
 */
public class EulerPhi1 {
    // n의 오일러 피 함수 값을 반환하는 함수 < 수학 공식을 코드화한 경우임.
    public static int phi(int n) {
        int result = n;
        // 2부터 sqrt(n)까지 소인수 판별
        for (int p = 2; p * p <= n; p++) {
            // p가 n의 소인수라면
            if (n % p == 0) {
                // 같은 소인수로 나누어 떨어지는 경우 반복적으로 나눔
                while (n % p == 0)
                    n /= p;
                // 공식에 따라 result 값 감소
                result -= result / p;
            }
        }
        // 마지막 남은 소인수(1개 이상 남았을 때) 처리
        if (n > 1)
            result -= result / n;
        return result;
    }

    public static void main(String[] args) {
        int n = 30;
        System.out.println("phi(" + n + ") = " + phi(n));
        // 결과: phi(30) = 8
    }
}
