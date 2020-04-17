public class Character_valueOf {
    public static void main(String[] args) {
        char char1 = 'y';
        char char2 = '\u0065';
        char char3 = 115;
        System.out.println("문자 값 출력");
        System.out.println("y(문자) : "  + Character.valueOf(char1));
        System.out.println("\\u0065(유니코드) : "  + Character.valueOf(char2));
        System.out.println("115(아스키코드) : "  + Character.valueOf(char3));
    }
}
