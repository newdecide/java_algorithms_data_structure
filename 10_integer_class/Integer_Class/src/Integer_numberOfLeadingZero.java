public class Integer_numberOfLeadingZero {
    public static void main(String[] args) {
        int value = 40;
        System.out.println("40 2진수 : " + Integer.toBinaryString(value));
        System.out.println("2진수 오른쪽 끝 비트수 : " + Integer.numberOfTrailingZeros(value));
        int value2 = 45;
        System.out.println("45 2진수 : " + Integer.toBinaryString(value2));
        System.out.println("2진수 오른쪽 끝 비트수 : " + Integer.numberOfTrailingZeros(value2));
    }
}
