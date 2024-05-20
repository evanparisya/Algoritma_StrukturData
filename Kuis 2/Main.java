/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        DoubleLinkedLists.Klasemen klasemen = new DoubleLinkedLists().new Klasemen();

        klasemen.tambahPembalap(new Node("Fabio Quartararo", "Prancis", "Monster Energy Yamaha MotoGP", 122));
        klasemen.tambahPembalap(new Node("Francesco Bagnaia", "Italia", "Ducati Lenovo Team", 112));
        klasemen.tambahPembalap(new Node("Aleix Espargaró", "Spanyol", "Aprilia Racing Team Gresini", 75));
        klasemen.tambahPembalap(new Node("Joan Mir", "Spanyol", "Team Suzuki Ecstar", 68));
        klasemen.tambahPembalap(new Node("Enea Bastianini", "Italia", "Gresini Racing MotoGP", 64));

        klasemen.urutkanPembalap();
        klasemen.cetakKlasemen();
    }
}