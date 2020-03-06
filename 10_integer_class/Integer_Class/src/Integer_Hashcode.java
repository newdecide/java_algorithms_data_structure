public class Integer_Hashcode {
    public static void main(String[] args) {
        Object object = new Object();
        System.out.println("오브젝트 클래스 : " + object);
        System.out.println("오브젝트 클래스 해시로 변환 : " + object.hashCode());
        Integer integer = new Integer(306);
        System.out.println("정수형 클래스 해시 변환 : " + integer.hashCode());

    }
}
