import java.util.Scanner;
public class BukuMain09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku09 data = new PencarianBuku09();
        int jumBuku = 5;

        System.out.println("---------------------------------------");
        System.out.println("Masukan data buku secara urut dari kode buku terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("---------------------");
            System.out.print("Kode Buku : ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul  Buku : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang : ");
            String pengarang = s1.nextLine();
            System.out.print("stok : ");
            int stok = s.nextInt();
            
            

            Buku09 m = new Buku09(kodeBuku, judulBuku, tahunTerbit, pengarang, stok);
            data.tambahBuku(m);
        }

        System.out.println("---------------------------------------");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("1. Pencarian berdasarkan Kode Buku");
        System.out.println("2. Pencarian berdasarkan Judul Buku");
        System.out.print("Pilihan: ");
        int pilihan = s.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Masukan Kode Buku yang dicari : ");
                System.out.print("Kode Buku : ");
                String cariKode = s1.next();
                System.out.println("Menggunakan Sequential Search");
                int posisiKode = data.FindSeqSearch(cariKode);
                data.tampilPosisi(cariKode, posisiKode);
                data.TampilData(cariKode, posisiKode);
                System.out.println("---------------------------------------");
                System.out.println("Menggunakan Binary Search");
                posisiKode = data.FindBinarySearch(cariKode, 0, jumBuku - 1);
                data.tampilPosisi(cariKode, posisiKode);
                data.TampilData(cariKode, posisiKode);
                
                break;
            case 2:
                System.out.println("Masukan Judul Buku yang dicari : ");
                System.out.print("Judul Buku : ");
                String cariJudul = s1.next();
                System.out.println("Menggunakan Sequential Search");
                int posisiJudulSequential = data.findJudulSequential(cariJudul);
                data.tampilPosisi(cariJudul, posisiJudulSequential);
                data.TampilData(cariJudul, posisiJudulSequential);
                int jumlahJudulSequential = 0;
                for (Buku09 buku : data.listBK) {
                    if (buku != null && buku.judulBuku.equals(cariJudul)) {
                        jumlahJudulSequential++;
                    }
                }
                if (jumlahJudulSequential > 1) {
                    System.out.println("Peringatan: Terdapat lebih dari satu hasil dengan judul buku '" + cariJudul + "'!");
                }
                System.out.println("---------------------------------------");
                System.out.println("Menggunakan Binary Search");
                int posisiJudulBinary = data.findJudulBinary(cariJudul);
                data.tampilPosisi(cariJudul, posisiJudulBinary);
                data.TampilData(cariJudul, posisiJudulBinary);
                int jumlahJudulBinary = 0;
                for (Buku09 buku : data.listBK) {
                    if (buku != null && buku.judulBuku.equals(cariJudul)) {
                        jumlahJudulBinary++;
                    }
                }
                if (jumlahJudulBinary > 1) {
                    System.out.println("Peringatan: Terdapat lebih dari satu hasil dengan judul buku '" + cariJudul + "'!");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}