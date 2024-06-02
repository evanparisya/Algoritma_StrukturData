/**
 * Node
 */
public class Node {

    int id;
    String judulFilm;
    double rating;
    Node prev, next;

    Node(Node prev, int id, String judulFilm, double rating, Node next){
        this.prev = prev;
        this.id = id;
        this.judulFilm = judulFilm;
        this.rating = rating;
        this.next = next;
    }
}