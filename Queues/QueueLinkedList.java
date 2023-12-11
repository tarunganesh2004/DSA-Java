public class QueueLinkedList {
    LinkedList list;

    public QueueLinkedList() {
        list = new LinkedList();
        System.out.println("The Queue is Successfully created");
    }

    // isEmpty
    public boolean isEmpty() {
        if (list.head == null) {
            return true;
        } else {
            return false;
        }
    }

    // enQueue
    public void enQueue(int value) {
        list.insertLinkedList(value, list.size);
        System.out.println("Successfully inserted " + value + " in the Queue");
    }

    // deQueue
    public int deQueue() {
        int value = -1;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            value = list.head.value;
            list.deletionOfNode(0);
        }
        return value;
    }

    // peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            return list.head.value;
        }
    }

    // delete Queue
    public void deleteQueue() {
        list.head = null;
        list.tail = null;
        System.out.println("The Queue is successfully deleted");
    }
}
