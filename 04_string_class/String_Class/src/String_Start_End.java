public class String_Start_End {
    public static void main(String[] args) {
        String text = "start and end";
        boolean startwith = text.startsWith("s");
        System.out.println(text+ "의 시작값과 'a'인가?(맞으면 true, 아니면 false) =  " + startwith);
        boolean startwith2 = text.startsWith("b");
        System.out.println(text+ "의 시작값과 'b'인가?(맞으면 true, 아니면 false) =  " + startwith2);
        boolean endwith = text.endsWith("d");
        System.out.println(text + "의 마지막문자가 't'인가(맞으면 true, 아니면 false) = " + endwith);
        boolean endwith2 = text.endsWith("e");
        System.out.println(text + "의 마지막문자가 'y'인가(맞으면 true, 아니면 false) = " + endwith2);

    }
}
