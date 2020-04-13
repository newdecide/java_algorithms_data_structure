public class Character_isLowerCase {
    public static void main(String[] args) {
        System.out.println("소문자 확인 메서드 소문자가 맞으면 true 아니면 false");
        System.out.println("'o'는 소문자인가? " + Character.isLowerCase('o'));
        System.out.println("'116'는 소문자인가? " + Character.isLowerCase(116));
        System.out.println("아스키코드 '116'를 문자로 표현 : " + (char)116);
        System.out.println("'O'는 소문자인가? " + Character.isLowerCase('O'));
        System.out.println("']'는 소문자인가? " + Character.isLowerCase(']'));
    }
}
