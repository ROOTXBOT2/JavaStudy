package Algorhythm.NumberTheory;

import java.util.ArrayList;
import java.util.*;

/**
 * @author rua
 */
public class SieveOfEratosthenes {
     public static List<Integer> sieve(int N) {
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) primes.add(i);
        }
        return primes;
    }

    public static void main(String[] args) {
        System.out.println(sieve(30));  // [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
    }
}

