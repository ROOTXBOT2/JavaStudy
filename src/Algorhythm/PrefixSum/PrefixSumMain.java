package Algorhythm.PrefixSum;// Main.java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * @author rua
 */

public class PrefixSumMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 줄: 수의 개수 N, 질의 개수 M
        StringTokenizer st = new StringTokenizer(br.readLine()," "); //delim 구분자 지정
        int N = Integer.parseInt(st.nextToken()); // 배열 길이
        int M = Integer.parseInt(st.nextToken()); // 질의 개수

        // 두 번째 줄: 배열 A
        int[] array = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        // 누적합 클래스 생성
        PrefixSum ps = new PrefixSum(array);

        // M개의 질의 처리
        for (int q = 0; q < M; q++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            System.out.println(ps.PrefixSumStartEnd(start, end));
        }
    }
}
