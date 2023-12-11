class Main {
    public static void main(String[] args) {
        CircularDoubleLinkedList cdll = new CircularDoubleLinkedList();
        cdll.createCDLL(1);
        cdll.insertNode(2, 0);
        cdll.insertNode(3, 2);
        cdll.insertNode(4, 5);
        // System.out.println(cdll.head.next.value);
        cdll.traverseCDLL();
        // cdll.reverseTraversalCDLL();
        // cdll.searchNode(1);
        // cdll.deleteNode(0);
        cdll.deleteCDLL();
        cdll.traverseCDLL();
    }
}