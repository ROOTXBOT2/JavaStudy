package Algorhythm.Search;
import java.util.*;

/**
 * @author rua
 */
public class BinarySearch2 {

    public static void main(String[] args) {
        String number = "422568768";
        int N = 4;
        System.out.println(solution(number, N));
    }

    public static String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();

        for (char digit : number.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() < digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        // k가 남아있는 경우, 뒤에서부터 제거
        while (k-- > 0) {
            stack.pop();
        }

        // 스택 -> 문자열로 변환
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}
