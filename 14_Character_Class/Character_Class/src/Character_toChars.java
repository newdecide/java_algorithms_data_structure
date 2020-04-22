public class Character_toChars {
    public static void main(String[] args) {

        char[] codepoint1 = Character.toChars(67);
        char[] codepoint2 = Character.toChars(104);
        char[] codepoint3 = Character.toChars(97);
        char[] codepoint4 = Character.toChars(114);

        String str1 ="";
        for (char c:codepoint1){
            str1 = str1+c;
        }
        String str2 ="";
        for (char c:codepoint2){
            str2 = str2+c;
        }
        String str3 ="";
        for (char c:codepoint3){
            str3 = str3+c;
        }
        String str4 ="";
        for (char c:codepoint4){
            str4 = str4+c;
        }

        System.out.println("C(67) UTF-16 표현 : "+codepoint1);
        System.out.println("h(104) UTF-16 표현 : "+codepoint2);
        System.out.println("a(97) UTF-16 표현 : "+codepoint3);
        System.out.println("r(114) UTF-16 표현 : "+codepoint4);
        System.out.println(str1 + str2 + str3 + str4);
    }
}
