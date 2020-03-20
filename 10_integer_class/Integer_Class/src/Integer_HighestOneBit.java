public class Integer_HighestOneBit {
    public static void main(String[] args) {
        int number = 200;
        System.out.println(number + " 2진수 : " + Integer.toBinaryString(number));
        System.out.println(number + "의 최고 비트 : " + Integer.highestOneBit(number));
    }
}
