public class Integer_LowestOneBit {
    public static void main(String[] args) {
        int number = 100;
        System.out.println(number + " 2진수 : " + Integer.toBinaryString(number));
        System.out.println(number + " 의 최저 비트 : " + Integer.lowestOneBit(number));
    }
}
