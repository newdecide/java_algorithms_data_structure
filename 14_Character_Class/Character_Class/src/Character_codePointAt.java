public class Character_codePointAt {
    public static void main(String[] args) {
        String charcode = "CodePointAt";
        for (int i = 0; i < charcode.length(); i++){
            System.out.println("CodePointAt("+i+") = " + charcode.codePointAt(i) + " : " +(char)charcode.codePointAt(i));
        }
    }
}
