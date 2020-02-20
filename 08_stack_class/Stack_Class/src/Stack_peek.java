import java.util.Stack;

public class Stack_peek {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 1; i <= 5; i++ ){
            stack.push(i);
        }
        System.out.println(stack);
        System.out.println("현재 Stack 조회 : "+stack.peek());
    }
}
