public class Stack {
    // stack using array
    int[] arr;
    int topOfStack;

    // creation
    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The Stack is created with size of: " + size);
    }

    // isEmpty
    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }

    // isFull
    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            System.out.println("The Stack is full");
            return true;
        } else {
            return false;
        }
    }

    // Push
    public void push(int value) {
        if (isFull()) {
            // System.out.println("Stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is successfully Inserted");
        }
    }

    // Pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

    // Delete method
    public void deleteStack() {
        arr = null;
        System.out.println("The stack is successfully deleted");
    }
}
