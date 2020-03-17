public class Integer_RotateRight {
    public static void main(String[] args) {
        int number = 128;

        System.out.println("128 오른쪽 쉬프트");
        for (int shift=1; shift < 7; shift++){
            System.out.println("number 오른쪽 쉬프트[>>] : " + Integer.rotateRight(number,shift));
        }
        System.out.println();

        System.out.println("128오른쪽 쉬프트 비트 표현");
        for (int shift=1; shift < 8; shift++){
            System.out.println(Integer.rotateRight(number,shift)+" : " + Integer.toBinaryString(Integer.rotateRight(number,shift)));
        }
    }
}
