/**
 * Main
 */
import java.util.Scanner;
 public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("=========== MotoGP ===========");
        System.out.println("==============================");
        System.out.print("Masukkan jumlah Pembalap : ");
        int jumlahPembalap = sc.nextInt();

        DoubleLinkedLists.Klasemen klasemen = new DoubleLinkedLists().new Klasemen();

        for (int i = 0; i < jumlahPembalap; i++) {
            System.out.print("Masukkan nama pembalap: ");
            String namaPembalap = sc.next();
            System.out.print("Masukkan negara pembalap: ");
            String negaraPembalap = sc.next();
            System.out.print("Masukkan tim pembalap: ");
            String timPembalap = sc.next();
            System.out.print("Masukkan poin pembalap: ");
             int poinPembalap = sc.nextInt();

            klasemen.tambahPembalap(new Node(namaPembalap, negaraPembalap, timPembalap, poinPembalap));
        }
        klasemen.urutkanPembalap();
        klasemen.cetakKlasemen();
    }
}