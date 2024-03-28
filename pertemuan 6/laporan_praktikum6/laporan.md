# Laporan Praktikum 6
## Percobaan 1 : Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort
#### Kode program
Mahasiswa
<img src="image.png">

DaftarMahasiswaBerprestasi
<img src="image-3.png">

Main
<img src="image-2.png">

#### Hasil run
<img src="image-4.png">
<img src="image-5.png">

#### Pertanyaan
1. Terdapat di method apakah proses bubble sort?
2. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:
<img src="image-6.png">
Untuk apakah proses tersebut?

3. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
<img src="image-7.png">

    a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j?
    
    b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
    
    c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
    
    d. Jika banyak data di dalam listMhs adalah 50, maka berapakali     perulangan i akan berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?  

#### Jawaban
1. Proses algoritma bubble sort terdapat di dalam method bubbleSort() pada class DaftarMahasiswaBerprestasi.
2. untuk proses penukaran(swap) antara dua elemen yang bersebelahan dalam array listMhs.
3.  a. Perulangan i berfungsi untuk mengontrol jumlah iterasi utama atau putaran yang dilakukan dalam proses pengurutan. Sedangkan Perulangan j berfungsi untuk membandingkan setiap pasangan elemen yang bersebelahan dalam array pada setiap iterasi utama.

    b. Karena dalam algoritma Bubble Sort hanya membutuhkan n-1 iterasi utama untuk mengurut array dengan panjang n.

    c. Karena dalam algoritma Bubble Sort syarat tersebut bertujuan untuk mengoptimalkan proses pengurutan dan menghindari membandingkan elemen-elemen yang sudah terurut pada setiap iterasi utama (i).

    d. Jika banyak data di dalam listMhs adalah 50 maka perulangan i akan berlangsung sebanyak 49 kali. Karena dalam kasus ini, n adalah 50, sehingga perulangan i akan berlangsung dari i = 0 hingga i = 48 (total 49 iterasi).

## Percobaan 2 : Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Selection Sort
#### Kode program
DaftarMahasiswaBerprestasi
<img src="image-8.png">

Main
<img src="image-9.png">

#### Hasil run
<img src="image-10.png">
<img src="image-11.png">

#### Pertanyaan
Di dalam method selection sort, terdapat baris program seperti di bawah ini:
<img src="image-12.png">
Untuk apakah proses tersebut, jelaskan!

#### Jawaban
Proses tersebut digunakan untuk mencari indeks elemen dengan nilai ipk terkecil di antara elemen-elemen yang belum terurut dalam array listMhs.

## Percobaan 3 : Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort
#### Kode program
DaftarMahasiswaBerprestasi
<img src="image-13.png">

Main
<img src="image-14.png">

#### Hasil run
<img src="image-15.png">
<img src="image-16.png">

#### Pertanyaan
Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting
dengan cara descending.

#### Jawaban
<img src="image-25.png">
perubahan terdapat pada baris while

## Latihan Praktikum
#### Pertanyaan
Sebuah platform travel yang menyediakan layanan pemesanan kebutuhan travelling sedang
mengembangkan backend untuk sistem pemesanan/reservasi akomodasi (penginapan), salah
satu fiturnya adalah menampilkan daftar penginapan yang tersedia berdasarkan pilihan filter
yang diinginkan user. Daftar penginapan ini harus dapat disorting berdasarkan
1. Harga dimulai dari harga termurah ke harga tertinggi.
2. Rating bintang penginapan dari bintang tertinggi (5) ke terendah (1)

Buatlah proses sorting data untuk kedua filter tersebut dengan menggunakan algoritma
bubble sort dan selection sort. 
<img src="image-17.png">

#### Jawaban
###### Kode Program
Hotel
<img src="image-18.png">

HotelService
<img src="image-19.png">
<img src="image-20.png">

MainHotel
<img src="image-21.png">

###### Hasil run
<img src="image-22.png">
<img src="image-23.png">
<img src="image-24.png">