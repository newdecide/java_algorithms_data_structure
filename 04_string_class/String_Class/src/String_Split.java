public class String_Split {
    public static void main(String[] args) {
        String text = "축구,야구,농구,수영";
        String[] splittext = text.split(",");

        for (String split : splittext){
            System.out.println("운동 : " + split);
        }
    }
}
