class Main {
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        csll.insertCSLL(4, 0);
        csll.insertCSLL(6, 1);
        csll.insertCSLL(7, 8);
        // System.out.println(csll.head.value);
        // System.out.println(csll.head.next.next.value);
        csll.traverseSLL();
        System.out.println();
        // csll.searchNode(5);
        // csll.deleteNode(3);
        // csll.deleteNode(0);
        csll.deleteSLL();
        csll.traverseSLL();
    }
}
