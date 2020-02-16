public class String_Comparison {
    public static void main(String[] args) {
        String text1 = "java";
        String text2 = "code";

        System.out.println("java vs code: " + text1.compareTo(text2));
        System.out.println("java vs code = " + text1.equals(text2));
        text2 = "java";
        System.out.println("java vs java: " + text1.compareTo(text2));
        System.out.println("java vs java = " + text1.equals(text2));
        text2 = "va";
        System.out.println("java 문자열 안에 va가 있나요? " + text1.contains(text2));

        int number = 1000000;
        String intcompare = String.format("%,d", number);
        String stringcompare = "1,000,000";
        boolean matches = intcompare.matches(stringcompare);
        System.out.println("int와 string 비교 : " + matches);

    }
}

