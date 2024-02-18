import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiSetara, totalNilai = 0, ipSMT = 0;
        int sks = 18;
        String nilaiHuruf;
        String [][] matkuls = new String[9][2];
        double [][] angka = new double[9][2];
        double [] nilaiAngka = new double[9];


        for (int i = 0; i < 9; i++) {
            System.out.print("Mata Kuliah : ");
            String matkul = sc.nextLine();
            matkuls[i][0] = matkul;

            System.out.print("Bobot SKS : ");
            double bobotSKS = sc.nextDouble();
            angka[i][0] = bobotSKS;

            sc.nextLine();
        }

        System.out.println("===============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("===============================");

        for (int i = 0; i < 9; i++) {
            System.out.printf("%-2s %-37s %s", "masukkan nilai Angka untuk Mata Kuliah", matkuls[i][0], ": ");
            double nilai = sc.nextDouble();
            nilaiAngka [i] = nilai;

            if (nilaiAngka[i] >= 81) {
                nilaiHuruf = "A";
                nilaiSetara = 4;
            }else if (nilaiAngka[i] >= 74) {
                nilaiHuruf = "B+";
                nilaiSetara = 3.5;
            } else if (nilaiAngka[i] >= 66) {
                nilaiHuruf = "B";
                nilaiSetara = 3;
            } else if (nilaiAngka[i] >= 61) {
                nilaiHuruf = "C+";
                nilaiSetara = 2.5;
            } else if (nilaiAngka[i] >= 51) {
                nilaiHuruf = "C";
                nilaiSetara = 2;
            } else if (nilaiAngka[i] >= 40) {
                nilaiHuruf = "D";
                nilaiSetara = 1;
            } else {
                nilaiHuruf = "E";
                nilaiSetara = 0;
            }

            matkuls[i][1] = nilaiHuruf;
            angka[i][1] = nilaiSetara;
            
        }

        System.out.println("======================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("======================");

        System.out.printf("%-40s %-14s %-14s %s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < 9; i++) {
            System.out.printf("%-40s %-19.2f %-13s %.2f\n", matkuls[i][0], nilaiAngka[i], matkuls[i][1], angka[i][1]);
        }

        for (int i = 0; i < 9; i++) {
            totalNilai += angka[i][1] * angka[i][0];
        }

        ipSMT = totalNilai / sks;

        System.out.println("======================");
        System.out.printf("IP : %.2f%n", ipSMT);
    }
}