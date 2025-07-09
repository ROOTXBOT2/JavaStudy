package Algorhythm.NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author rua
 */

public class SieveOfEratosthenes2 {
    public static List<Integer> sieve(int N) {
        boolean[] isPrime = new boolean[N+1];
        Arrays.fill(isPrime, true );
        isPrime[0] = isPrime[1] = false;

        for(int i = 2; i*i<=N; i++) {
            if(isPrime[i]) {
                for (int j = i*i; j < N; j += i) {
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

    // 세 소수의 합으로 표현
    private static void printThreePrimeSum(int n, List<Integer> primes) {
        Set<Integer> primeSet = new HashSet<>(primes);
        boolean found = false;

        for (int i = 0; i < primes.size() && !found; i++) {
            int a = primes.get(i);
            for (int j = i; j < primes.size() && !found; j++) {
                int b = primes.get(j);
                int c = n - a - b;
                if (c < b) continue; // 오름차순 조건을 위해 b ≤ c
                if (primeSet.contains(c)) {
                    System.out.println(a + " " + b + " " + c);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("0");  // 혹시 조합이 불가능할 경우
        }
    }

    public static void main(String[] args) throws IOException {
        // 입력 처리
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());  // 첫 줄: 테스트 개수
        int[] arr = new int[T];
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());  // 각 줄마다 숫자
            arr[t] = n;
        }
        for( int i :arr){
            List<Integer> primes = sieve(i);
            printThreePrimeSum(i,primes); // 소수 3개 합 조합 출력 함수 호출
        }
    }
}
