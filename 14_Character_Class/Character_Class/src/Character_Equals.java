public class Character_Equals {
    public static void main(String[] args) {
        Character char1 = 'c';
        Character char2 = new Character('c');
        char char3 = 'c';
        char char4 = '\u0063';
        char char5 = (char)99;


        if(char1.equals(char2)){
            System.out.println("'Character c'와 new Character('c') 두 문자는 같다.");
        } else {
            System.out.println("'Character c'와 new Character('c') 두 문자는 다르다");
        }
        if(char1.equals(char3)){
            System.out.println("'char c'와 'Character c' 두 문자는 같다.");
        } else {
            System.out.println("'char c'와 'Character c' 두 문자는 다르다");
        }
        if(char1.equals(char4)){
            System.out.println("'Character c'와 '\\u0063' 두 문자는 같다.");
        } else {
            System.out.println("'Character c'와 '\\u0063' 두 문자는 다르다");
        }
        if(char1.equals(char5)){
            System.out.println("'Character c'와 '(char)99' 두 문자는 같다.");
        } else {
            System.out.println("'Character c'와 '(char)99' 두 문자는 다르다");
        }
    }
}
