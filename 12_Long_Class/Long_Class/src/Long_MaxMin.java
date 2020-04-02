public class Long_MaxMin {
    public static void main(String[] args) {
        System.out.println("정수형 클래스(64비트) 최댓값 : " + Long.MAX_VALUE);
        System.out.println("정수형 클래스(64비트) 최솟값 : " + Long.MIN_VALUE);
        System.out.println();

        System.out.println("정수형 큰값 비교 메서드");
        System.out.println(""  + Long.max(124354423512342L, 23423465635636L));
        System.out.println("정수형 작은 값 비교 메서드");
        System.out.println( Long.min(124354423512342L, 23423465635636L));

    }
}
