public class Integer_Value {
    public static void main(String[] args) {
        String number = "123";
        if (number instanceof String) {
            System.out.println("문자열입니다.");
        }
        if (Integer.valueOf(number) instanceof Integer) {
            System.out.println("정수형입니다.");
        }
        System.out.println("정수형 값 : " + Integer.valueOf(number).intValue());
    }
}
