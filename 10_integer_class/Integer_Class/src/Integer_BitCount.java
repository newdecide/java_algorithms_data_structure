public class Integer_BitCount {
    public static void main(String[] args) {
        int number = 127;
        System.out.println("127의 2진수로 변환 : " + Integer.toBinaryString(number));
        System.out.println("127의 1비트 수 확인 : " + Integer.bitCount(number));
    }
}
