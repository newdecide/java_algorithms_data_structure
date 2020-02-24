import java.util.LinkedList;

public class Queue_add {
    public static void main(String[] args) {
        LinkedList queue =new LinkedList();

        for (int i = 5; i >= 1 ; i--){
            queue.add(i);
        }
        System.out.println(queue);
    }
}
