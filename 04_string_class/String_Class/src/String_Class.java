public class String_Class {
    public static void main(String[] args) {
        String text1 = "java";
        String text2 = "code";

        System.out.println("java vs code: " +text1.compareTo(text2));
        text2 = "java";
        System.out.println("java vs java: "+text1.compareTo(text2));
    }
}

