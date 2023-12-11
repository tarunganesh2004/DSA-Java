class stackexample2 {
    int arr[];
    int top;
    int capacity;

    stackexample2(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("overflow");
            System.exit(1);
        }
        System.out.println("Inserting: " + x);
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        return arr[top--];
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public void printstack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        stackexample2 s = new stackexample2(7);
        s.push(29);
        s.push(67);
        s.push(89);
        s.push(67);
        s.push(78);
        s.push(102);
        s.push(100);
        s.push(200);

        // s.pop();
        // s.pop();
        System.out.println("After popping out");
        s.printstack();
    }
}
