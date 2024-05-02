import java.util.Scanner;
public class Utama09 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Masukkan kapasitas gudang: ");
        int kapasitasGudang = sc.nextInt();
        Gudang09 gudang = new Gudang09(kapasitasGudang);

        while(true){
            System.out.println("\nMenu");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Lihat barang teratas");
            System.out.println("4. Lihat Barang Terbawah");
            System.out.println("5. Cari Barrang");
            System.out.println("6. Tampilkan Barang Tumpukan");
            System.out.println("7. Keluar");
            System.out.print("Pilih Operasi : ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc.nextInt();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc.nextLine();
                    sc.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = sc.nextLine();
                    Barang09 barangBaru = new Barang09(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang09();
                    break;
                case 3:
                    gudang.lihatBarangTeratas();
                    break;
                case 4:
                    gudang.lihatBarangTerbawah();
                    break;
                case 5:
                    System.out.print("Masukkan Barang : ");
                    String nama1 = sc.nextLine();
                    gudang.cariBarang(nama1);
                    break;
                case 6:
                    gudang.tampilkanBarang();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}
