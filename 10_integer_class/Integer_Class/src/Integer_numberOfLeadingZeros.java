public class Integer_numberOfLeadingZeros {
    public static void main(String[] args) {
        int integer = 486;
        int negative_number = -75;

        // 정수와 음수 판별(0일때만 음수를 나타냄)
        System.out.println("정수면 0보다 큰 숫자가 나옴 : " + Integer.numberOfLeadingZeros(integer));
        System.out.println("음수면 0이 나옴 : " +Integer.numberOfLeadingZeros(negative_number));

    }
}
