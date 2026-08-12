import java.util.Stack;
public class Stackpractice {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.pop();
        if(stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
        //peek
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Size of stack is: " + stack.size());
        //stack traversal
        System.out.println("Stack elements are: ");
        for(int i = stack.size() - 1; i >= 0; i--)
        {
            System.out.println(stack.get(i));
        }
        

    }
}
