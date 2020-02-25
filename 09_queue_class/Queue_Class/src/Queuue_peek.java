import java.util.LinkedList;

public class Queuue_peek {
    public static void main(String[] args) {
        LinkedList queue = new LinkedList();
        for (int i = 1; i <= 5; i++) {
            queue.offer(i+"번");
        }
        System.out.println("큐 = "+queue);
        System.out.println("첫번째 데이터 조회 : "+queue.peek());
        System.out.println("큐(변경 없음) = "+queue);
    }
}
