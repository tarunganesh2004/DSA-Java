// Main class for queuelinkedlist
public class MainQLL {
    public static void main(String[] args) {
        QueueLinkedList newQLL = new QueueLinkedList();
        newQLL.enQueue(10);
        newQLL.enQueue(20);
        newQLL.enQueue(30);
        int result = newQLL.peek();
        System.out.println(result);
        int result1 = newQLL.peek();
        System.out.println(result1);

        newQLL.deleteQueue();
    }
}
