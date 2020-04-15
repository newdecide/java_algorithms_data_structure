public class Character_toLowerCase {
    public static void main(String[] args) {
        System.out.println("소문자 변환 메서드");
        System.out.println("A를 문자 출력 : : " + 'A');
        System.out.println("A를 문자 소문자로 변환 : " + Character.toLowerCase('A'));
        System.out.println();
        System.out.println("\'73\' 문자변환 결과 : " + (char) 73);
        System.out.println("\'73\' 아스키 코드를 소문자로 변환 : " + Character.toLowerCase((char) 73));
        System.out.println();
        System.out.println("'\\u004D' 유니코드 변환 : " + '\u004D');
        System.out.println("'\\u004D' 유니코드룰 소문자로 변환 : " + Character.toLowerCase('\u004D'));
    }
}
