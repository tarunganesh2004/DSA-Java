class Main {
    public static void main(String[] args) {
        CircularQueue newCQ = new CircularQueue(4);
        newCQ.enQueue(10);
        newCQ.enQueue(20);
        newCQ.enQueue(30);
        newCQ.enQueue(40);

        int result = newCQ.peek();
        System.out.println(result);
        int result1 = newCQ.peek();
        System.out.println(result1);

        newCQ.deleteCQ();
    }
}
