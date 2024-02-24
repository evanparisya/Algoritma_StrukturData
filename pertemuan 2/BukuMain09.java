public class BukuMain09 {
    public static void main(String[] args) {
        Buku09 bk1 = new Buku09();

        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku09 bk2 = new Buku09("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku09 bukuevanparisya = new Buku09("Cara Membuat Es Teh", "Evan Parisya Adriel", 50, 30, 35000);
        bukuevanparisya.terjual(16);
        bukuevanparisya.tampilInformasi();

        System.out.println("\nHarga Asli = Rp." + bukuevanparisya.hitungHargaTotal());
        System.out.println("Diskon = Rp." + bukuevanparisya.hitungDiskon());
        System.out.println("Harga Bayar = Rp." +bukuevanparisya.hitungHargaBayar());
    }
}
