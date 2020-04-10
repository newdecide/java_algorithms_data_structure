public class Character_isDigit {
    public static void main(String[] args) {
        System.out.println("문자 클래스 숫자 확인 메서드 (Character 타입이 숫자가 맞으면 true, 틀리면 false)");
        System.out.println("c는 "+"숫자 인가요? " + Character.isDigit('c'));
        System.out.println("\'1\'은 "+"숫자 인가요? " + Character.isDigit('1'));
    }
}
