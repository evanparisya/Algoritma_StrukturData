public class mainNilaiMhs {
    public static void main(String[] args) {
        DaftarNilaiMhs mhs = new DaftarNilaiMhs();
        int jumlahMhs=17;

        Mahasiswa m1 = new Mahasiswa(9);
        Mahasiswa m2 = new Mahasiswa(26);
        Mahasiswa m3 = new Mahasiswa(15);
        Mahasiswa m4 = new Mahasiswa(49);
        Mahasiswa m5 = new Mahasiswa(10);
        Mahasiswa m6 = new Mahasiswa(25);
        Mahasiswa m7 = new Mahasiswa(42);
        Mahasiswa m8 = new Mahasiswa(14);
        Mahasiswa m9 = new Mahasiswa(44);
        Mahasiswa m10 = new Mahasiswa(25);
        Mahasiswa m11 = new Mahasiswa(3);
        Mahasiswa m12 = new Mahasiswa(2);
        Mahasiswa m13 = new Mahasiswa(12);
        Mahasiswa m14 = new Mahasiswa(19);
        Mahasiswa m15 = new Mahasiswa(10);
        Mahasiswa m16 = new Mahasiswa(30);
        Mahasiswa m17 = new Mahasiswa(29);

        mhs.tambah(m1);
        mhs.tambah(m2);
        mhs.tambah(m3);
        mhs.tambah(m4);
        mhs.tambah(m5);
        mhs.tambah(m6);
        mhs.tambah(m7);
        mhs.tambah(m8);
        mhs.tambah(m9);
        mhs.tambah(m10);
        mhs.tambah(m11);
        mhs.tambah(m12);
        mhs.tambah(m13);
        mhs.tambah(m14);
        mhs.tambah(m15);
        mhs.tambah(m16);
        mhs.tambah(m17);

        System.out.println("data sebelum disorting : ");
        mhs.tampil();
        int posisisebelum = mhs.FindBinarySearch1(3, 0, jumlahMhs - 1);
        mhs.tampilPosisi(3, posisisebelum);
        System.out.println("sorting data dgn selectionSort 1 : ");
        mhs.selectionSort1();
        mhs.tampil();
        int posisi1 = mhs.FindBinarySearch1(3, 0, jumlahMhs - 1);
        mhs.tampilPosisi(3, posisi1);
        System.out.println("sorting data dgn selectionsort 2 : ");
        mhs.selectionSort2();
        mhs.tampil();
        int posisi2 = mhs.FindBinarySearch2(3, 0, jumlahMhs - 1);
        mhs.tampilPosisi(3, posisi2);
        System.out.println("Mencari nilai 99 setelah sorting descending:");
        int posisitidak = mhs.FindBinarySearch2(99, 0, jumlahMhs - 1);
    }
}
