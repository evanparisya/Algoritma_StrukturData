import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class MainHotel {
    public static void main(String[] args) {
        
        HotelService list = new HotelService();
        Hotel h1 = new Hotel("Trio Hotel", "Malang", 1700000, (byte)3);
        Hotel h2 = new Hotel("Sari Hotel", "Madiun", 1300000, (byte)2);
        Hotel h3 = new Hotel("New Start Hotel", "Pandaan", 1500000, (byte)3);
        Hotel h4 = new Hotel("Savanna Hotel", "Malang", 3000000, (byte)5);
        Hotel h5 = new Hotel("Satria Hotel", "Surabaya", 2500000, (byte)4);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Data Hotel sebelum sorting : ");
        list.tampil();

        System.out.println("Data Hotel setelah sorting berdasarkan harga hotel yang tertinggi : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Hotel setelah sorting berdasarkan bintang hotel yang terendah : ");
        list.selectionSort();
        list.tampil();
    }
}
