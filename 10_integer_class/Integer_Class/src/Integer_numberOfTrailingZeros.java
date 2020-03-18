public class Integer_numberOfTrailingZeros {
    public static void main(String[] args) {
        // 정수형 끝 zero 개수 확인
        int integertrailvalue = 40;
        System.out.println("40(2진수) : " + Integer.toBinaryString(integertrailvalue));
        System.out.println("2진수 오른쪽 끝 zero 개수 : " + Integer.numberOfTrailingZeros(integertrailvalue));
        int integertrailvalue2 = 45;
        System.out.println("45(2진수) : " + Integer.toBinaryString(integertrailvalue2));
        System.out.println("2진수 오른쪽 끝 zero 개수 : " + Integer.numberOfTrailingZeros(integertrailvalue2));
    }
}
