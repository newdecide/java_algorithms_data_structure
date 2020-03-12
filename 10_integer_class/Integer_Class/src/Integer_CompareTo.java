public class Integer_CompareTo {
    public static void main(String[] args) {
        Integer num = 12345;
        int compare_result = num.compareTo(12345);
        System.out.println("12345와 같으면 [0], 아니면 [1] : " + compare_result);
        if (compare_result == 0){
            System.out.println("12345와 같다.");
        }

        System.out.println();
        int compare_result2 = num.compareTo(365);
        System.out.println("12345와 같으면 [0], 아니면 [1] : " + compare_result2);
        if (compare_result2 == 1){
            System.out.println("12345와 다르다.");
        }

        System.out.println();

        System.out.println("100과 100이 같으면[0], 아니면[1] : " + Integer.compare(100, 100));
        System.out.println("120 > 109[a > b(a가 크면 : 1]) : " + Integer.compare(120, 109));
        System.out.println("104 < 109[a < b(b가 크면 : -1]) : " + Integer.compare(104, 109));

    }
}
