import java.util.HashSet;

public class removeDuplicates {
    void deleteDuplicates(LinkedList ll) {
        HashSet<Integer> hs = new HashSet<>();
        Node current = ll.head;
        Node prev = null;

        while (current != null) {
            int currentValue = current.value;
            if (hs.contains(currentValue)) {
                prev.next = current.next;
                ll.size--;
            } else {
                hs.add(currentValue);
                prev = current;
            }
            current = current.next;
        }
    }
}
