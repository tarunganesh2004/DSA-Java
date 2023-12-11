class Main {
    public static void main(String[] args) {
        QueueArray newQueue = new QueueArray(4);
        newQueue.enQueue(1);
        newQueue.enQueue(2);
        newQueue.enQueue(3);
        newQueue.enQueue(4);

        // int result = newQueue.peek();
        // System.out.println(result);
        // int result1 = newQueue.peek();
        // System.out.println(result1);

        newQueue.deleteQueue();
    }
}