package Algorhythm.NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author rua
 */

public class SieveOfEratosthenes3 {
    public static void threePrimeNumbers() {
        Scanner scanner = new Scanner(System.in);
        boolean[] isPrime = new boolean[10000];
        int maxK = 1000;

        Arrays.fill(isPrime, true);

        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= maxK; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxK; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int[] answer = new int[]{0, 0, 0};
        int T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            int K = scanner.nextInt();

            int number = K - 1;
            int answerIndex = 2;
            int temp = K;

            while (temp > 0) {
                if (isPrime[number]) {
                    if (temp == K) {
                        if ((K - number) % 2 == 0 && (K - number) >= 4) {
                            answer[answerIndex--] = number;
                            temp -= number;
                        } else {
                            number--;
                        }
                    } else {
                        int check = temp - number;
                        if (check > 0 && isPrime[check]) {
                            answer[answerIndex--] = number;
                            temp -= number;
                            answer[answerIndex--] = check;
                            temp -= check;
                        } else {
                            number--;
                        }
                    }
                } else {
                    number--;
                }
            }

            for (int num : answer) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        threePrimeNumbers();
    }
}
