public class String_replace {
    public static void main(String[] args) {
        String basictext = "hello world";

        String replace = basictext.replace("hello", "welcome");
        System.out.println("hello를 world로 변경 : "+ replace);

        String replaceall = basictext.replaceAll("\\p{Space}", "_");
        System.out.println("hello world 스페이스룰 _로 변환 : "+replaceall);
    }
}
