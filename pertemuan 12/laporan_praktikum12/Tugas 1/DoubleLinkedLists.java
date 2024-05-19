public class DoubleLinkedLists {
    Node head;
    int size;

    DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (isEmpty()) {
            head = new Node(null, item, null);
            size++;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
        }
    }
}
