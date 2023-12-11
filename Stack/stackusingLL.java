// Creation of stack using Linkedlist

class Node {
    public int value;
    public Node next;
}

class LinkedList {
    public Node head;
    public Node tail;
    public int size;

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

    // Insertion
    public void insertLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createSLL(nodeValue);
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    // Deletion
    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("SLL Doesn't exist");
            return;
        } else if (location == 0) {

            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }
}

class stackLL {
    LinkedList ll;

    public stackLL() {
        ll = new LinkedList();
    }

    // push method
    public void pushElement(int value) {
        ll.insertLinkedList(value, 0);
        System.out.println("Inserted " + value + " in Stack");
    }

    // isEmpty
    public boolean isEmpty() {
        if (ll.head == null) {
            return true;
        } else {
            return false;
        }
    }

    // pop method
    public int popElement() {
        int result = -1;
        if (isEmpty()) {
            System.out.println("Stack is Empty");

        } else {
            result = ll.head.value;
            ll.deletionOfNode(0);
        }
        return result;
    }

    // peek method
    public int peekElement() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return ll.head.value;
        }
    }

    // Delete method
    public void deletestack() {
        ll.head = null;
        System.out.println("The stack is deleted");
    }
}

public class stackusingLL {
    public static void main(String[] args) {
        stackLL newStack = new stackLL();
        // boolean result = newStack.isEmpty();
        // System.out.println(result);
        newStack.pushElement(1);
        newStack.pushElement(2);
        newStack.pushElement(3);
        newStack.pushElement(4);

        int result = newStack.peekElement();
        System.out.println(result);
        int result1 = newStack.peekElement();
        System.out.println(result1);

        newStack.deletestack();

    }
}
