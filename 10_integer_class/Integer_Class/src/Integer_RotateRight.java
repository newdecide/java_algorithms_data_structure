public class Integer_RotateRight {
    public static void main(String[] args) {
        int number = 128;

        System.out.println("128 오른쪽 쉬프트");
        for (int shift=1; shift < 7; shift++){
            System.out.println("number 오른쪽 쉬프트[>>] : " + Integer.rotateRight(number,shift));
        }
    }
}
