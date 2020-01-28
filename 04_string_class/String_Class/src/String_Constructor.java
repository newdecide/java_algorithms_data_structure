import java.nio.charset.Charset;

public class String_Constructor {
    public static void main(String[] args) {
        String new_string = new String();

        if (new_string == ""){
            System.out.println("빈문자열 입니다.");
        } else {
            System.out.println("1.String 객체를 생성했습니다.");
        }

        String string = "바이트 문자열 확인 텍스트";
        byte[] bytes = string.getBytes();
        String byte_string = new String(bytes);
        System.out.println("2."+byte_string);

        System.out.println("3."+new String(bytes, Charset.forName("UTF-8")));
    }
}
