public class String_format {
    public static void main(String[] args) {
        int number = 100000000;
        String stringformet = String.format("%,d", number);
        System.out.println("정수를 스트링 포맷으로 변환 : " + stringformet);
    }
}
