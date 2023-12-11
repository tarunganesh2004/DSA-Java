public class DoublyLinkedList {
    DoublyNode head; // creating head and tail
    DoublyNode tail;
    int size;

    // creation
    public DoublyNode createDLL(int nodeValue) {
        head = new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        newNode.next = null;
        newNode.prev = null;
        // Creating a link b/w head,node and tail
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }

    // Insertion Method
    public void insertDLL(int nodeValue, int location) {
        // create a new node
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;

        if (head == null) {
            createDLL(nodeValue);
            return;
        }
        // at the beginning
        else if (location == 0) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        }
        // at the end
        else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        // At any location
        else {
            DoublyNode tempNode = head; // current node
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            newNode.prev = tempNode;
            newNode.next = tempNode.next;
            tempNode.next = newNode;
            newNode.next.prev = newNode;
        }
        size++;
    }

    // Traversal
    public void traverseDLL() {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" --> ");
                }
                tempNode = tempNode.next;
            }
        } else {
            System.out.println("The DLL doesn't exist");
        }
        System.out.println("\n");
    }

    // Reverse Traversal in DLL
    public void reverseTraverseDLL() {
        if (head != null) {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i != size - 1) {
                    System.out.print(" <-- ");
                }
                tempNode = tempNode.prev;
            }
        } else {
            System.out.println("DLL Doesn't exist");
        }
        System.out.println("\n");
    }

    // search for a Node in a DLL
    public boolean searchNode(int nodeValue) {
        if (head != null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.print("The node is found at location: " + i);
                    return true;
                }
                tempNode = tempNode.next;
            }

        }
        System.out.print("Node not found");
        return false;
    }

    // Deletion of a node
    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("DLL Doesn't exist");
            return;
        }
        // delete from begininng
        else if (location == 0) {
            if (size == 1) {
                head = null;
                tail = null;
                size--;
            } else {
                head = head.next;
                head.prev = null;
                size--;
            }
        }
        // from end
        else if (location >= size) {
            DoublyNode tempNode = new DoublyNode();
            if (size == 1) {
                head = null;
                tail = null;
                size--;
            } else {
                tempNode.next = null;
                tail = tempNode;
                size--;
            }
        } else {
            DoublyNode tempNode = head;
            for (int i = 0; i < (location - 1); i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            tempNode.next.prev = tempNode;
            size--;
        }
    }

    // Deletion of entire DLL
    public void deleteDLL() {
        DoublyNode tempNode = head;
        for (int i = 0; i < size; i++) {
            tempNode.prev = null;
            tempNode = tempNode.next;
        }
        head = null;
        tail = null;
        System.out.println("The DLL has been Deleted");
    }
}
