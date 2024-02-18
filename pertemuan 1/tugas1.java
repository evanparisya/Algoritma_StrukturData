import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        // Array pertama berisi kode plat mobil
        char[] KODE = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };

        // Array kedua berisi nama kota yang berpasangan dengan kode plat mobil
        char[][] KOTA = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' }
        };

        Scanner sc = new Scanner(System.in);

        //  input kode plat mobil
        System.out.print("Masukkan kode plat mobil: ");
        char input = sc.next().toUpperCase().charAt(0);

        // Mencari nama kota dari kode plat mobil
        boolean found = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == input) {
                System.out.println("Nama kota: " + String.valueOf(KOTA[i]));
                found = true;
            }
        }

        // Jika kode plat mobil tidak ditemukan, tampilkan pesan error
        if (!found) {
            System.out.println("Kode plat mobil tidak ditemukan.");
        }
    }
}