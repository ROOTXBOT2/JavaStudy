package Algorhythm;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author rua
 */
public class PrefixSum{
    public int[] Array;
    public int[] prefixSum;

    public void PrefixSumStart() {
        prefixSum[0] = Array[0];
        for(int i = 1; i< Array.length; i++){
            prefixSum[i] = prefixSum[i-1] + Array[i];
        }
    }

    public PrefixSum(int[] array) {
        Array = array;
        prefixSum = new int[Array.length];
        PrefixSumStart();
    }

    public int PrefixSumStartEnd(int start,int end) {
        return prefixSum[end - 1] - ((start <= 1) ? 0 : prefixSum[start - 2]);
    }

}
