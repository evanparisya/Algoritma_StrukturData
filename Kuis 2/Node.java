/**
 * Node
 */
public class Node {

    String nama;
    String negara;
    String tim;
    int poin;
    Node prev;
    Node next;

    public Node(String nama, String negara, String tim, int poin) {
        this.nama = nama;
        this.negara = negara;
        this.tim = tim;
        this.poin = poin;
        this.prev = null;
        this.next = null;
    }
}