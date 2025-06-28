package String.equals;

/**
 * @author rua
 */
public class StringEqualsMain {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교: " + (str1 == str2));
        System.out.println("new String() equals 비교: " + (str1.equals(str2)));
        String str3 = "hello";
        String str4 = "hello";

        // 문자열을 바로 할당하는 방법은 문자열 풀을 사용해 문자열을 저장하는데 이때 동일한 값이 문자열 리터럴이 있으면 동일한 값을 바라보게 한다.
        // 그래서 리터럴 == 비교가 성공한다.
        // 문자열 풀은 힙에 저장하며 Hash로 검색 Big-O(1)
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }
}
