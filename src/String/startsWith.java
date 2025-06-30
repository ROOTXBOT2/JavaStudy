package String;

/**
 * @author rua
 */
// startsWith()를 사용해서 url이 https://로 시작하는지 확인해라.
public class startsWith {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        //코드 작성
        System.out.println("https:// 가 포함되어있나? : "+url.startsWith("https://"));
    }
}
