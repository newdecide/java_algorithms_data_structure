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

        char[] chararray = {'d','a','t','a','s','t','r','u','c','t','u','r','e'};

        System.out.println("8."+new String(chararray));

        System.out.println("9."+new String(chararray, 0,4));

        int[] inttostring = {99,104,97,110,103,101};

        System.out.println("10."+new String(inttostring, 0, 6));

        String stringtype = "String Type";
        System.out.println("11."+stringtype);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("스트링 버퍼");
        System.out.println("12."+ new String(stringBuffer));

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("스트링 빌더");
        System.out.println("13."+ new String(stringBuilder));
    }
}
