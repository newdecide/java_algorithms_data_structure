import java.util.EmptyStackException;
import java.util.Stack;

public class Stack_pop {
    public static void main(String[] args) {
        Stack stack = new Stack<>();
        for (int i = 1; i <= 5; i++){
            stack.push(i*2);
        }
        System.out.println("현재 스택 값: "+ stack);
        System.out.println("나간 데이터 : "+ stack.pop());
        System.out.println("변경된 스택 값: "+ stack);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        try {
            System.out.println(stack.pop());
        } catch (EmptyStackException e){
            System.out.println("더이상 들어 있는 데이터가 없습니다.");
        }

    }
}
