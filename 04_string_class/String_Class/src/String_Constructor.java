import java.io.UnsupportedEncodingException;
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

        byte[] bytearray = {'h','e','l','l','o','w','o','r','l','d'};

        System.out.println("4."+new String(bytearray, 0, 5 ));

        try {
            System.out.println("5."+new String(bytearray, 5,5, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println("6."+new String(bytearray, 0,10, Charset.forName("EUC-KR")));

        byte[] bytearray2 = {'j','a','v','a'};

        try {
            System.out.println("7."+new String(bytearray2, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
