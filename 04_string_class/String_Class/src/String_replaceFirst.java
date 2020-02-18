public class String_replaceFirst {
    public static void main(String[] args) {
        String changetext = "Firstman";
        System.out.println("지정한 문자 변환 전 : " + changetext);
        String replaceFirst = changetext.replaceFirst("First","Super");
        System.out.println("지정한 문자 변환 후 : " + replaceFirst);
    }
}
