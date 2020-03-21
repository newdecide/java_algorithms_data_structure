public class Integer_Combination {
    public static void main(String[] args) {
        int number = 359;
        System.out.println("비트의 개수 : " + Integer.bitCount(number));
        System.out.println("최저 비트 : " + Integer.lowestOneBit(number));

        int lowestbit = Integer.lowestOneBit(number);
        System.out.println("최고 비트 : " + Integer.highestOneBit(number));

        int highbit = Integer.highestOneBit(number);
        System.out.println("2진수 변환 : " + Integer.toBinaryString(number));
    }
}
