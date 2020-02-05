public class String_IndexOf {
    public static void main(String[] args) {
        String text1 = "IndexOf Test";
        int indexof = text1.indexOf("x");
        System.out.println("indexof(x) = "+indexof);

        String text2 = "LastIndexOf Test";
        int lastindexof = text2.lastIndexOf("t");

        System.out.println("lastindexof(t) = " + lastindexof);

    }
}
