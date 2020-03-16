public class Integer_RotateLeft {
    public static void main(String[] args) {
        int number = 2;

        System.out.println("2 왼쪽 쉬프트");
        for (int shift = 0; shift < 7; shift++) {
            System.out.println("number 왼쪽 쉬프트[<<] " + Integer.rotateLeft(number, shift));
        }
    }
}
