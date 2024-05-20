/**
 * DoubleLinkedLists
 */
public class DoubleLinkedLists {

    class Klasemen {
        Node head;
        Node tail;
    
        public void tambahPembalap(Node pembalap) {
            if (head == null) {
                head = pembalap;
                tail = pembalap;
            } else {
                pembalap.next = head;
                head.prev = pembalap;
                head = pembalap;
            }
        }
    
        public void urutkanPembalap() {
            Node current = head;
            while (current != null) {
                Node nextRider = current.next;
                while (nextRider != null) {
                    if (current.poin < nextRider.poin) {
                        int tempPoin = current.poin;
                        current.poin = nextRider.poin;
                        nextRider.poin = tempPoin;
                    }
                    nextRider = nextRider.next;
                }
                current = current.next;
            }
        }
    
        public void cetakKlasemen() {
            System.out.println("Klasemen MotoGP\n");
            int posisi = 1;
            Node current = head;
            while (current != null) {
                System.out.printf("%-2d. %-20s %-30s : %3d poin\n", posisi, current.nama + " (" + current.negara + ")", "- " + current.tim, current.poin);
                posisi++;
                current = current.next;
            }
        }
    }
}