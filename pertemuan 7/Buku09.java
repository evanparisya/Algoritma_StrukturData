/**
 * Buku
 */
public class Buku09 {
    String kodeBuku;
    String judulBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    Buku09 (String kB, String jB, int tT, String p, int s) {
        this.kodeBuku = kB;
        this.judulBuku = jB;
        this.tahunTerbit = tT;
        this.pengarang = p;
        this.stock = s;
    }

    void tampilDataBuku() {
        System.out.println("========================");
        System.out.println("Kode buku :"+kodeBuku);
        System.out.println("Judul buku :"+judulBuku);
        System.out.println("Tahun terbit :"+tahunTerbit);
        System.out.println("Pengarang :"+pengarang);
        System.out.println("Stock :"+stock);
    }
}