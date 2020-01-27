public class Null_Empry_String {
    public static void main(String[] args) {
        String nullstring = null;
        String emptystring = "";

        System.out.println("널 문자열 nullstring = "+ nullstring);
        System.out.println("빈 문자열 emptystring = "+emptystring);

        try {
            System.out.println(nullstring.length());
        } catch (NullPointerException e){
            System.out.println("Null 에러가 발생했습니다.");
        }

        System.out.println(emptystring.length());
    }
}
