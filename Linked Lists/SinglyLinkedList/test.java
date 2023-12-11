class Node {
    int value;
    Node next;
}

class LinkedList {
    Node head;
    Node tail;
    int size;

    public Node createSLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
}

class test {
    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        // L.createSLL(4);
        L.createSLL(5);
        System.out.println(L.tail.value);
    }
}