import java.util.LinkedList;

public class Queue_poll {
    public static void main(String[] args) {
        LinkedList queue = new LinkedList();
        for (int i = 0; i < 5; i++) {
            queue.add(i);
        }

        System.out.println("큐 : " + queue);
        System.out.println("첫번째 데이터 반환 및 제거 : " + queue.poll());
        System.out.println("현재 남아 있는 데이터 : "+queue);
    }
}
