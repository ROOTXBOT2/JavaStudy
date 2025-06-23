package Algorhythm;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author rua
 */

public class PrefixSum {
    private int[] array;
    private int[] prefixSum;

    // 생성자: 배열 주입 + 누적합 계산
    public PrefixSum(int[] array) {
        this.array = array;
        this.prefixSum = new int[array.length];
        buildPrefixSum();
    }

    // 누적합 배열 생성
    private void buildPrefixSum() {
        prefixSum[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + array[i];
        }
    }

    // 구간 합 계산: 1-based 인덱스 처리
    public int PrefixSumStartEnd(int start, int end) {
        return prefixSum[end - 1] - ((start <= 1) ? 0 : prefixSum[start - 2]);
    }
}
