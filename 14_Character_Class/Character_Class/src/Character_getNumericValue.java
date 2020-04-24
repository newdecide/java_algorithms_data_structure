public class Character_getNumericValue {
    public static void main(String[] args) {

        System.out.println("NumericValue는 1~35의 정수값을 같습니다.");
        System.out.println("소문자, 대문자, 1~9의 char 타입 숫자값 입력시 정수 값이 나옵니다.");
        System.out.println("그 외의 값은 -1이 나옵니다.");
        System.out.println("NumericValue = \'1\' " + Character.getNumericValue('1'));
        System.out.println("NumericValue = \'2\' " + Character.getNumericValue('2'));
        System.out.println("NumericValue = \'3\' " + Character.getNumericValue('3'));
        System.out.println("NumericValue = \'9\' " + Character.getNumericValue('9'));
        System.out.println("NumericValue = \'a\' " + Character.getNumericValue('a'));
        System.out.println("NumericValue = \'b\' " + Character.getNumericValue('b'));
        System.out.println("NumericValue = \'C\' " + Character.getNumericValue('C'));
        System.out.println("NumericValue = \'z\' " + Character.getNumericValue('z'));
        System.out.println();

        System.out.println("NumericValue = 1 " + Character.getNumericValue(1));
        System.out.println("NumericValue = 2 " + Character.getNumericValue(2));
        System.out.println("NumericValue = \']\'" + Character.getNumericValue(']'));
        System.out.println("NumericValue = \'*\'" + Character.getNumericValue('*'));
    }
}
