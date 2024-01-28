package LearningModule;

public class StackDemo {
    private static final int MAX_SIZE = 100;
    private int[] stackArray = new int[MAX_SIZE];
    private int top = -1;

    // push()
    public void push(int value) {
        if (top < MAX_SIZE - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed: " + value);
        } else {
            System.out.println("Stack overflow, can't push");
        }
    }

    // pop()
    public int pop() {
        if (top >= 0) {
            int poppedValue = stackArray[top--];
            System.out.println("Popped value: " + poppedValue);
            return poppedValue;
        } else {
            System.out.println("Stack underflow, can't pop");
            return -1;
        }
    }

    // peek()
    public void peek() {
        if (top >= 0) {
            int peekValue = stackArray[top];
            System.out.println("Peeked value: " + peekValue);
        } else {
            System.out.println("Stack is empty, can't peek");
        }
    }

    public static void main(String[] args) {
        // Creating an instance of StackDemo
        StackDemo stack = new StackDemo();

        // Pushing values onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Peeking at the top of the stack
        stack.peek();

        // Popping values from the stack
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
