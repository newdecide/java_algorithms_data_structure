public class Integer_Parse_Int {
    public static void main(String[] args) {
        String stringnumber = "120";
        String stringnumber2 ="243";

        System.out.println("문자열 연결 : " + stringnumber + stringnumber2);

        System.out.println("243 - 120 : " + (Integer.parseInt(stringnumber2) - Integer.parseInt(stringnumber)));

        System.out.println("스트링 숫자값을 정수형으로 출력 : " + Integer.valueOf("170"));

    }
}

