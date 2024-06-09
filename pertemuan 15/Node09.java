/**
 * Node09
 */
public class Node09 {

    int data;
    Node09 prev, next;
    int jarak;

    Node09 (Node09 prev, int data, int jarak, Node09 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }
}