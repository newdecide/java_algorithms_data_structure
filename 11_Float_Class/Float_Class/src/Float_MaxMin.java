public class Float_MaxMin {
    public static void main(String[] args) {
        System.out.println("실수형 최댓값 : " + Float.MAX_VALUE);
        System.out.println("실수형 최솟값 : " + Float.MIN_VALUE);
        System.out.println();

        System.out.println("실수형 큰값 비교 메서드");
        System.out.println("345210.1f와 224450.3f 큰 값 : " + Float.max(345210.1f, 224450.3f));
        System.out.println("실수형 작은값 비교 메서드");
        System.out.println("345210.1f와 224450.3f 큰 값 : " + Float.min(345210.1f, 224450.3f));

    }
}

