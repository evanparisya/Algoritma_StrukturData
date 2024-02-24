/**
 * Buku09
 */
public class Buku09 {

    String judul, pengarang;
    int halaman, stok, harga, jual;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            if (jml <= stok) {
                jual = jml;
                stok -= jml;
                System.out.println("Buku berhasil terjual sebanyak " + jml + " buah");
            } else {
                System.out.println("Stok buku tidak mencukupi. " + stok + " buah yang dapat terjual.");
            }
        } else {
            System.out.println("Stok buku kosong. Penjualan tidak dapat dilakukan.");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal() {
        return harga * jual;
    }

    int hitungDiskon() {
        if(hitungHargaTotal() >= 150000) {
            return (hitungHargaTotal() * 12/100);
        } else if(hitungHargaTotal() >= 75000 && hitungHargaTotal() < 150000) {
            return (hitungHargaTotal() * 5/100);
        } else {
            return 0;
        }
    }

    int hitungHargaBayar() {
        return hitungHargaTotal() - hitungDiskon();
    }

    public Buku09() {

    }

    public Buku09(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

}