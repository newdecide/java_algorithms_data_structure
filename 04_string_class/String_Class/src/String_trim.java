public class String_trim {
    public static void main(String[] args) {
        String stringwithspaces = "    [ hello trim test ]   ";
        String string_trim = stringwithspaces.trim();

        System.out.println("공백 포함된 문자열: "+ stringwithspaces);
        System.out.println("앞 뒤 공백제거: "+string_trim);
    }
}
