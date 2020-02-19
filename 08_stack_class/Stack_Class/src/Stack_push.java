import java.util.Stack;

public class Stack_push {
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 1; i <= 9; i++ ){
            stack.push(i * 3);
        }
        System.out.println(stack);
    }
}
