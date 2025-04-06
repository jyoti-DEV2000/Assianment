import java.util.Stack;

public class ReverseStack {

    
    public static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
        } else {
            
            int temp = stack.pop();
            insertAtBottom(stack, item);

            
            stack.push(temp);
        }
    }

    
    public static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            
            int temp = stack.pop();
            reverseStack(stack);

            
            insertAtBottom(stack, temp);
        }
    }

    
    public static void printStack(Stack<Integer> stack) {
        for (int i : stack) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        
        stack.push(15);
        stack.push(25);
        stack.push(35);
        stack.push(45);

        System.out.println("Original Stack:");
        printStack(stack);

    
        reverseStack(stack);

        System.out.println("Reversed Stack:");
        printStack(stack);
    }
}