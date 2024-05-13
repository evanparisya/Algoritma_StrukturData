import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void menu() {
        System.out.println("Pilih Menu :");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek antrian paling belakang");
        System.out.println("5. Cek semua antrian");
        System.out.println("6. Cek nomor antrian dengan nama");
        System.out.println("7. Cek data dengan nomro antrian");
        System.out.println("8. keluar");
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList antri = new LinkedList();

        int i = 1;

        System.out.println("-----PROGRAM ANTRIAN LAYANAN UNIT KEMAHASISWAAN-----");

        do {
            menu();
            int pilih = sc.nextInt();
            sc.nextLine();

            if (pilih == 0) {
                break;
            }

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM: ");
                    int nim = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa dt = new Mahasiswa(nama, nim);
                    antri.addLast(dt);
                    i++;
                    System.out.println();
                    break;
            
                case 2:
                    antri.removeFirst();
                    i--;
                    System.out.println();
                    break;
                case 3:
                    antri.peekData(1);
                    System.out.println();
                    break;
                case 4:
                    antri.peekData(2);
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    antri.print();
                    break;
                case 6:
                    System.out.println("Masukkan nama : ");
                    String nm = sc.nextLine();
                    System.out.println("Nama : " + nm + "ada pada antrian ke- " + antri.indexOf(nm));
                    System.out.println();
                    break;
                case 7:
                    System.out.print("Masukkan nomor antrian : ");
                    int idx = sc.nextInt();
                    if (idx < i) {
                        Mahasiswa mh = antri.getData(idx-1);
                        System.out.println("Data pada antrian ke-" + idx);
                        System.out.println("Nama : " + mh.nama + "NIM : " + mh.nim);
                        System.out.println();
                    } else {
                        System.out.println("Antrian ke-" + idx + "tidak ada");
                    } 
                    System.out.println();
                    break;
            }
        } while (true);
    }
}
