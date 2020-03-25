public class Integer_Value {
    public static void main(String[] args) {
        String number = "123";
        if (number instanceof String) {
            System.out.println("문자열입니다.");
        }
        if (Integer.valueOf(number) instanceof Integer) {
            System.out.println("정수형입니다.");
        }
        System.out.println("정수형(int) 값 : " + Integer.valueOf(number).intValue());

        System.out.println();
        System.out.println("정수형(int) 최댓값 : " + Integer.valueOf(Integer.MAX_VALUE).intValue());

        try {
            System.out.println("정수형의 범위 값은 Long타입 출력 가능 :" + Integer.valueOf(Integer.MAX_VALUE).longValue());
            System.out.println(Integer.valueOf("21474836450").longValue());
        } catch (NumberFormatException e) {
            System.out.println("\"21474836450\"은 정수형 범위를 넘습니다.");
            System.out.println("정수형(Long) 최댓값 : " + Long.valueOf(Long.MAX_VALUE).longValue());
        }

        System.out.println("정수형(Byte) 최댓값 : " + Integer.valueOf(Byte.MAX_VALUE).byteValue());
        System.out.println("정수형(Short) 최댓값 : " + Integer.valueOf(Short.MAX_VALUE).shortValue());



    }
}
