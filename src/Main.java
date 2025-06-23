import Algorhythm.PrefixSum;

import java.io.IOException;

/**
 * @author rua
 */
//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        PrefixSum X = new PrefixSum(array);

        int[] result = new int[10];
        X.PrefixSumStart();

        System.out.println(X.PrefixSumStartEnd(5,10));
    }
}