public class Character_codePointAt {
    public static void main(String[] args) {
        String charcode = "CodePointAt";
        for (int i = 0; i < charcode.length(); i++){
            System.out.println("CodePointAt("+i+") = " + charcode.codePointAt(i) + " : " +(char)charcode.codePointAt(i));
        }
        System.out.println();

        String charcode2 = "CodePointBefore";
        for (int i = 1; i < charcode2.length()+1; i++){
            System.out.println("CodePointBefore("+i+") = " + charcode2.codePointBefore(i) + " : " +(char)charcode2.codePointBefore(i));
        }

    }
}
