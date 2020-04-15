public class Character_toUpperCase {
    public static void main(String[] args) {
        System.out.println("대문자 변환 메서드");
        System.out.println("k를 문자 출력 : : " + 'k');
        System.out.println("k를 문자 대문자로 변환 : " + Character.toUpperCase('k'));
        System.out.println();
        System.out.println("\'111\' 문자변환 결과 : " + (char) 111);
        System.out.println("\'111\' 아스키 코드를 대문자로 변환 : " + Character.toUpperCase((char) 111));
        System.out.println();
        System.out.println("'\\u0072' 유니코드 변환 : " + '\u0072');
        System.out.println("'\\u0072' 유니코드룰 대문자로 변환 : " + Character.toUpperCase('\u0072'));
    }
}
