public class Integer_reverse {
    public static void main(String[] args) {
        int reverseNumber = 86;
        System.out.println("86 2진수 : " + Integer.toBinaryString(reverseNumber));
        System.out.println("86 reverse 값 : " + Integer.reverse(reverseNumber));
        int restore = Integer.reverse(reverseNumber);
        System.out.println("1778384896(reverse 데이터) 2진수 : " + Integer.toBinaryString(restore));
        System.out.println("reverse 데이터 원상 복구 : " + Integer.reverse(restore));

    }
}
