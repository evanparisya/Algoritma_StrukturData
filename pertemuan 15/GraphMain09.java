import java.util.Scanner;

public class GraphMain09 {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Graph09 gedung = new Graph09(6);

    // Menu program
    int pilihan;
    do {
      System.out.println("\nMenu Graf:");
      System.out.println("---------------");
      System.out.println("1. Add Edge");
      System.out.println("2. Remove Edge");
      System.out.println("3. Degree");
      System.out.println("4. Print Graph");
      System.out.println("5. Cek Edge");
      System.out.println("0. Keluar");
      System.out.print("Masukkan pilihan: ");
      pilihan = sc.nextInt();

      switch (pilihan) {
        case 1: // Add Edge
          System.out.print("Masukkan gedung asal: ");
          int asal = sc.nextInt();
          System.out.print("Masukkan gedung tujuan: ");
          int tujuan = sc.nextInt();
          System.out.print("Masukkan jarak: ");
          int jarak = sc.nextInt();
          gedung.addEdge(asal, tujuan, jarak);
          break;

        case 2: // Remove Edge
          System.out.print("Masukkan gedung asal: ");
          asal = sc.nextInt();
          System.out.print("Masukkan gedung tujuan: ");
          tujuan = sc.nextInt();
          gedung.removeEdge(asal, tujuan);
          break;

        case 3: // Degree
          System.out.print("Masukkan gedung: ");
          int gedungIndex = sc.nextInt();
          gedung.degree(gedungIndex);
          break;

        case 4: // Print Graph
          gedung.printGraph();
          break;

        case 5: // Cek Edge
          System.out.print("Masukkan gedung asal: ");
          asal = sc.nextInt();
          System.out.print("Masukkan gedung tujuan: ");
          tujuan = sc.nextInt();
          boolean tetangga = gedung.bertetangga(asal, tujuan);
          char gedungAsal = (char) ('A' + asal);
          char gedungTujuan = (char) ('A' + tujuan);

          if (tetangga) {
            System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " bertetangga");
          } else {
            System.out.println("Gedung " + gedungAsal + " dan " + gedungTujuan + " tidak bertetangga");
          }
          break;

        case 0: // Keluar
          System.out.println("Keluar dari program.");
          break;

        default:
          System.out.println("Pilihan tidak valid!");
      }
    } while (pilihan != 0);

    sc.close();
  }
}
