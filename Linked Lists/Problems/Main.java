class Main {
    public static void main(String[] args) {
        // LinkedList ll = new LinkedList();
        // ll.createLL(1);
        // ll.insertNode(9);
        // ll.insertNode(5);
        // ll.insertNode(10);
        // ll.insertNode(2);
        // ll.traversalLL();

        // removeDuplicates r = new removeDuplicates();
        // r.deleteDuplicates(ll);
        // ll.traversalLL();

        // nthTolst n = new nthTolst();
        // Node node = n.nthToLast(ll, 3);
        // System.out.println(node.value);

        // Partition p = new Partition();
        // LinkedList t = p.partition(ll, 4);
        // t.traversalLL();

        // SumLists
        // LinkedList llA = new LinkedList();
        // llA.insertNode(7);
        // llA.insertNode(1);
        // llA.insertNode(6);
        // LinkedList llB = new LinkedList();
        // llB.insertNode(5);
        // llB.insertNode(9);
        // llB.insertNode(2);

        // sumLists s = new sumLists();
        // LinkedList result = s.sum(llA, llB);
        // result.traversalLL();

        // Intersection
        LinkedList llA = new LinkedList();
        llA.insertNode(3);
        llA.insertNode(1);
        llA.insertNode(5);
        llA.insertNode(9);
        LinkedList llB = new LinkedList();
        llB.insertNode(2);
        llB.insertNode(4);
        llB.insertNode(6);

        intersection in = new intersection();
        in.addSameNode(llA, llB, 7);
        in.addSameNode(llA, llB, 2);
        in.addSameNode(llA, llB, 2);
        Node inter = in.findIntersection(llA, llB);
        System.out.println(inter.value);
    }
}