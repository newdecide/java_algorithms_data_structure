public class String_join {
    public static void main(String[] args) {
        String joinmessage = String.join(" ", "Java","String" ,"join");
        System.out.println("조인 메시지1 : " + joinmessage);
        String joinmessage2 = String.join("_", "Java","String" ,"join");
        System.out.println("조인 메시지2 : " + joinmessage2);
    }
}
