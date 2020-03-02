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
    }
}
