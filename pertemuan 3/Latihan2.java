import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class mahasiswa {
    public String nama, nim, jenisKelamin;
    public double ipk;

    public mahasiswa(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
}

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] nilai = new double[3];
        mahasiswa[] mhs = new mahasiswa[3];
        String[] nama = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data mahasiswa ke- " + (i+1));
            System.out.print("Masukkan nama : ");
            nama[i] = sc.nextLine();
            System.out.print("Masukkan NIM : ");
            String nim = sc.nextLine();
            System.out.print("Masukkan jenis kelamin : ");
            String jenisKelamin = sc.nextLine();

            while (true) {
                try {
                    System.out.print("Masukkan IPK : ");
                    double ipk = sc.nextDouble();
                    mhs[i] = new mahasiswa(nama[i], nim, jenisKelamin, ipk);
                    nilai[i] = mhs[i].ipk;
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Silakan masukkan angka.");
                    sc.nextLine(); // Menghapus inputan yang tidak valid
                }
            }
        }

        System.out.println("Data Mahasiswa");
        System.out.println("Nama\tNIM\tJenis Kelamin\tIPK");

        for (int i = 0; i < 3; i++) {
            System.out.println(mhs[i].nama+"\t"+
            mhs[i].nim +"\t"+
            mhs[i].jenisKelamin +"\t"+
            mhs[i].ipk);
        }

        System.out.println("Rata-rata IPK : " +rataIpk(nilai));
        System.out.println("IPK terbesar : " + ipkTerbesar(nilai));
    }

    static double rataIpk(double[] ipk) {
        double jumlah = 0;
        for (int i = 0; i < ipk.length; i++) {
            jumlah += ipk[i];
        }
        return jumlah/ ipk.length;
    }

    static double ipkTerbesar(double[] ipk) {
        double max = ipk[0];
        for (int i = 1; i < ipk.length; i++) {
           if (ipk[i] > max) {
            max = ipk[i];
           } 
        }
        return max;
    }
}