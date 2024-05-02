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
#### Kode Program
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
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
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

    public Barang09 lihatBarangTerbawah() {
        if (!cekKosong()) {
            Barang09 barangTerbawah = tumpukan[0];
            System.out.println("Barang teratas: " + barangTerbawah.nama);
            return barangTerbawah;
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

    public String konversiDesimalKeBiner(int kode){
        StackKonversi09 stack = new StackKonversi09();
        while (kode > 0) {
            int sisa = kode % 2 ;
            stack.push(sisa);
            kode = kode/ 2;
        }
        String biner = new String();
        while (!stack.isEmpty()){
            biner = biner + stack.pop();
        }
        return biner;

    }
}
```
StackKonversi
```java
/**
 * StackKonversi09
 */
public class StackKonversi09 {

    int size;
    int [] tumpukanBiner;
    int top;

    public StackKonversi09() {
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
```

#### Hasil Run
<img src="image-1.png">

#### Pertanyaan
1. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), 
bagaimana hasilnya? Jelaskan alasannya!
2. Jelaskan alur kerja dari method konversiDesimalKeBiner!

#### Jawaban
1. <img src="image-2.png">
    hasil run <img src="image-4.png">
    modifikasi tersebut menghasilkan output yang sama dengan kondisi sebelumnya. 

2. Pertama, method ini membuat instance baru dari kelas StackKonversi09. Kelas StackKonversi09 digunakan untuk menyimpan sisa-sisa hasil pembagian dengan 2 secara sementara.
Kemudian, method memasuki perulangan while yang akan terus berjalan selama kode (bilangan desimal yang akan dikonversi) lebih besar dari 0.
Di dalam perulangan while, langkah pertama adalah menghitung sisa hasil pembagian kode dengan 2 menggunakan operasi modulo %. Sisa ini disimpan dalam variabel sisa.
Nilai sisa kemudian didorong (push) ke dalam stack menggunakan method push() dari kelas StackKonversi09.
Setelah itu, nilai kode diperbarui dengan hasil pembagian kode dengan 2 menggunakan operasi integer division /. Perulangan while akan terus berlanjut dengan mengulang langkah 3-5 hingga kode menjadi 0.
Setelah perulangan while selesai, maka semua sisa-sisa hasil pembagian dengan 2 telah disimpan dalam stack secara terbalik.
Selanjutnya, method membuat sebuah objek String baru yang kosong dengan nama biner.
Kemudian, method memasuki perulangan while baru yang akan berjalan selama stack tidak kosong.
Di dalam perulangan while ini, method mengambil elemen teratas dari stack menggunakan method pop() dan menambahkannya ke biner sebagai string.
Setelah perulangan while selesai, biner akan berisi representasi biner dari bilangan desimal yang dikonversi.
Terakhir, method mengembalikan biner sebagai hasil akhir.

## Percobaan 3: Konversi Notasi Infix ke Postfix
