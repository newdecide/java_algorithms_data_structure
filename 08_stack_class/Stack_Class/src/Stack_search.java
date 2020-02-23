import java.util.Stack;

public class Stack_search {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 1; i <= 5; i++){
            stack.push(i);
        }

        System.out.println("스택 데이터 : "+stack);
        System.out.println("스택 top[1] : "+stack.search(1));
        System.out.println("스택 top[2] : "+stack.search(2));
        System.out.println("스택 top[3] : "+stack.search(3));
        System.out.println("스택 top[4] : "+stack.search(4));
        System.out.println("스택 top[5] : "+stack.search(5));
    }
}
