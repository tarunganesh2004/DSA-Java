class sll {
    public Node head;
    public Node tail; // head and tails using Node class
    public int size;

    // method to create a singlyLinkedList
    public Node createSll(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;

        return head;
    }

    // Insert Method SinglyLinkedList --- O(1) TC
    public void insertLinkedList(int nodeValue, int location) {
        Node node = new Node(); // create a new node
        node.value = nodeValue;
        if (head == null) {
            createSll(nodeValue); // if head is null, singly linked list is empty
            return;
        }

        else if (location == 0) {
            // Insertion at beginnig
            node.next = head;
            head = node;
        } else if (location >= size) {
            // Insertion at ending
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

    // Traversal of SLL --- O(N) -TC, SC-O(1)
    public void traverseSLL() {
        if (head == null) {
            System.out.println("SLL doesnot exist");
        } else {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" --> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    // searching for a node in a SLL
    boolean searchNode(int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("Found the node at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }

        }
        System.out.println("Node not found");
        return false;
    }

    // Deletion of a node

    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("SLL Doesn't exist");
            return;
        } else if (location == 0) { // Delete firstNode from SLL

            // This is case in which SLL contains more than one element
            head = head.next; // head reference to second node
            size--;
            if (size == 0) {
                tail = null; // After deleting all elements if we have only one element then head and tail
                             // references are set to null
            }
        }
        // Deletion from end
        else if (location >= size) {
            Node tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) { // only one element in sll
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = null; // more than one element
            tail = tempNode;
            size--;
        }
        // Deletion from a location
        else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    // Deletion of entire singlyLinkedList

    public void deleteEntireSLL() {
        head = null;
        tail = null;
        System.out.println("SLL Deleted Successfully");
    }
}