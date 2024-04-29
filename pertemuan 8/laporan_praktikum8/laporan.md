# Laporan Pratikum 8
## Percobaan 1 : Penyimpanan Tumpukan Barang dalam Gudang
#### Kode Program
Barang
```java
/**
 * Barang09
 */
public class Barang09 {

    int kode;
    String nama;
    String kategori;

    Barang09(int kode, String nama, String kategori){
        this.kode = kode;
        this.nama = nama;           
        this.kategori = kategori;
    }
}
```
Gudang
```java
public class Gudang09 {
    Barang09[] tumpukan;
    int size;
    int top;

    public Gudang09(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang09[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang09 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + "berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang diGudang sudah penuh");
        }
    }

    public Barang09 ambilBarang09() {
        if (!cekKosong()) {
            Barang09 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang09 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang09 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        }else {
                System.out.println("Tumpukan barang kosong.");
        }
    }
}
```
Utama
```java
import java.util.Scanner;
public class Utama09 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Gudang09 gudang = new Gudang09(7);

        while(true){
            System.out.println("\nMenu");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Barang Tumpukan");
            System.out.println("4. Keluar");
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
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}
```

#### Pertanyaan
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi 
hasil percobaan! Bagian mana saja yang perlu diperbaiki?
2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode 
programnya!
3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang? Kalau kondisi 
tersebut dihapus, apa dampaknya?
4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat 
barang teratas, serta dapat secara bebas menentukan kapasitas gudang!
5. Commit dan push kode program ke Github
#### Jawaban
2. Tumpukan dapat menampung maksimal 7 data barang.
    <img src="image.png">
3. pengecekan kondisi !cekKosong() diperlukan untuk memastikan keamanan dan jalannya program yang benar dari program saat berurusan dengan tumpukan barang yang mungkin kosong. Jika pengecekan ini dihapus, maka program akan mencoba mengakses elemen array tumpukan meskipun array tersebut kosong, yang dapat menyebabkan kesalahan atau perilaku yang tidak diinginkan.

4. Berikut kode yang telah dimodifikasi berdasarkan pertanyaan
```java
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
            System.out.println("5. Tampilkan Barang Tumpukan");
            System.out.println("6. Keluar");
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
                    gudang.tampilkanBarang();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}
```

## Percobaan 2: Konversi Kode Barang ke Biner
