class Main {
    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);

        System.out.println(sLL.head.value);
    }
}

class Node {
    public int value;
    public Node next; // Next reference
}

class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public SinglyLinkedList createSinglyLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return this; // Return the SinglyLinkedList object
    }
}
