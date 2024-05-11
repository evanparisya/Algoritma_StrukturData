import java.util.Scanner;

public class PembeliMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kapasitas queue : ");
        int jumlah = sc.nextInt();

        Pembeli antri = new Pembeli(jumlah);

        int pilih = 0;

        do {
            antri.menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP : ");
                    int noHP = sc.nextInt();
                    Pembeli nb = new Pembeli(nama, noHP);
                    antri.Enqueue(nb);
                    break;
            
                case 2:
                    Pembeli data = antri.Dequeue();
                    if (!"".equals(data.nama) && data.noHP != 0) {
                        System.out.println("Data yang dikeluarkan : " + data.nama + " " + data.noHP);
                    }
                    break;
                case 3:
                    antri.Peek();
                    break;
                case 4:
                    antri.DaftarPembeli();
                    break;
                case 5;
                    antri.PeekRear();
                    break;
                case 6:
                    System.out.println("Masukkan nama pembeli yang ingin dicari : ");
                    String cariNama = sc.nextLine();
                    antri.PeekPosition(cariNama);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
