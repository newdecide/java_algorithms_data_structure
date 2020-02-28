import java.util.LinkedList;

public class Queue_Combination {
    public static void main(String[] args) {
        LinkedList queue = new LinkedList();

        for (int i = 65; i < 71; i++){
            queue.add((char)i);
        }

        System.out.println("큐 : " + queue);
        System.out.println("첫번째 데이터 조회 : " + queue.peek());
        System.out.println("큐(변경 없음) : " + queue);

        System.out.println("첫번째 데이터 반환 및 제거 : " + queue.poll());
        System.out.println("남아 있는 데이터 : " + queue);

        System.out.println("첫번째 데이터 제거 : " + queue.remove());
        System.out.println("남아 있는 데이터 : " + queue);
    }
}
