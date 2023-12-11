class CircularSinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    // Creation
    public Node createCSLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    // Insertion of a node

    public void insertCSLL(int nodeValue, int location) {
        // Create Node
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createCSLL(nodeValue);
            return;
        }
        // Insertion at beginning
        else if (location == 0) {

            node.next = head;
            head = node;
            tail.next = head;
        }
        // Insertion at end
        else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        }
        // Insertion at specified Location
        else {
            Node tempNode = head; // firstNode
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    // Traversal Method
    public void traverseSLL() {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("\nSLL Doesnt exist");
        }
    }

    // Search Method
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.print("Found Node at Location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node Not found");
        return false;
    }

    // Deletion of a node from Circular SLL
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("The CSLL does't exist");
            return;
        }
        // Beginning
        else if (location == 0) {
            // case-1 if we have more than one element
            head = head.next;
            tail.next = head;
            size--;
            if (size == 0) {
                // only one element
                tail = null;
                head.next = null;
                head = null;
            }
        }
        // Deletion at end
        else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        }
        // At a location
        else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // Deletion of entire Circular SLL
    public void deleteSLL() {
        if (head == null) {
            System.out.println("The CSLL Doesn't Exist");
        } else {
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The CSLL has been deleted");
        }
    }
}
