public class Character_getName {
    public static void main(String[] args) {
        System.out.println("문자 클래스 유니코드 네임");
        int[] codepoint = { 91, 78, 97, 109, 101, 93 };

        for (int i : codepoint){
            System.out.println("\'"+(char) i +"\'"+ "("+i+") 유니코드 네임 : " + Character.getName(i));
        }
        System.out.println();
        for (int i : codepoint){
            System.out.print((char) i);
        }


    }
}
