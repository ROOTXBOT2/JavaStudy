package String;

/**
 * @author rua
 */
//length() 를 사용해서 arr 배열에 들어있는 모든 문자열의 길이 합을 구해라.
public class stringLength {
    public static void main(String[] args) {
        String[] arr = {"hello","world1","hello12","world123","hello1234","world12345"};
        int result = 0;

        for (String i : arr ){
            System.out.println(i + ":" + i.length());
            result += i.length();
        }

        System.out.println("arr 배열에 들어있는 모든 문자열의 길이의 합은? : "+result);
    }
}
