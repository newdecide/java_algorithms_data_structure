import java.util.Stack;

public class Stack_empty {
    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("스택이 비어있나요? "+ stack.empty());

        stack.push(1);
        System.out.println("스택이 비어있나요? "+ stack.empty());

    }
}
