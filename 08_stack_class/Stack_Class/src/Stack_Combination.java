import java.util.Stack;

public class Stack_Combination {
    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 65; i < 71; i++){
            stack.push((char)i);
        }

        System.out.println("스택 : " + stack);
        System.out.println("현재 Stack 조회 : " + stack.peek());
        System.out.println("스택 top[6] : "+stack.search('A'));
        System.out.println("나간 데이터1 : "+stack.pop());
        System.out.println("스택이 비어 있나요 : "+stack.empty());
        
        System.out.println("나간 데이터2 : "+stack.pop());
        System.out.println("나간 데이터3 : "+stack.pop());
        System.out.println("나간 데이터4 : "+stack.pop());
        System.out.println("나간 데이터5 : "+stack.pop());
        System.out.println("나간 데이터6 : "+stack.pop());
        System.out.println("스택이 비어 있나요 : "+stack.empty());
    }
}
