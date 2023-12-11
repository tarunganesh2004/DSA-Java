class Main {
    public static void main(String[] args) {
        sll sLL = new sll();
        // sLL.createSll(5);
        // System.out.println(sLL.head.value);

        // Insertion
        sLL.insertLinkedList(6, 1);
        sLL.insertLinkedList(7, 3);
        sLL.insertLinkedList(8, 4);
        sLL.insertLinkedList(9, 0);
        System.out.println(sLL.head.next.value);
        System.out.println(sLL.head.next.next.value);
        sLL.traverseSLL();
        sLL.deletionOfNode(6);
        sLL.traverseSLL();

        // sLL.searchNode(7);
        sLL.deleteEntireSLL();
    }
}