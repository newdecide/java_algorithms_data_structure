public class Character_isUpperCase {
    public static void main(String[] args) {
        System.out.println("대문자 확인 메서드 대문자가 맞으면 true 아니면 false");
        System.out.println("'K'는 대문자인가? " + Character.isUpperCase('K'));
        System.out.println("'75'는 대문자인가? " + Character.isUpperCase(75));
        System.out.println("아스키코드 '75'를 문자로 표현 : " + (char)'K');
        System.out.println("'k'는 대문자인가? " + Character.isUpperCase('k'));
        System.out.println("'\\'는 대문자인가? " + Character.isUpperCase('\\'));
    }
}
