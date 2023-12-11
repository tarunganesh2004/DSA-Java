class RemoveNthFromEnd {

    public Node removeNthNodeFromEnd(Node head, int n) {
        Node tempNode = new Node();
        tempNode.next = head;

        Node p1 = tempNode;
        Node p2 = tempNode;

        for (int i = 0; i <= n; i++) {
            p2 = p2.next;
        }

        while (p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        p1.next = p1.next.next;

        return tempNode.next;
    }
}
