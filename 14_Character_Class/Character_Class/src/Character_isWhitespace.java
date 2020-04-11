public class Character_isWhitespace {
    public static void main(String[] args) {
        System.out.println("문자 값이 빈칸 값인지 확인 하는 메서드 빈칸이면 true, 빈칸이 아니면 false");
        System.out.println("문자 값이 빈칸 값인가? " + Character.isWhitespace('c'));
        System.out.println("문자 값이 빈칸 값인가? " + Character.isWhitespace(' '));
        System.out.println("문자 값이 빈칸 값인가? " + Character.isWhitespace('\n'));
        System.out.println("문자 값이 빈칸 값인가? " + Character.isWhitespace('\t'));

    }
}
