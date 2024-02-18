public class fungsi {
    public static void main(String[] args) {
        int[][] stok = {{10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}};

        tampilkanPendapatan(stok);

        tampilkanStokRoyalGarden4(stok);
    }

    public static void tampilkanPendapatan(int[][] stok) {
        int[] harga = {75000, 50000, 60000, 10000};

        for (int i = 0; i < stok.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stok[i].length; j++) {
                pendapatan += stok[i][j] * harga[j];
            }
            System.out.println("Pendapatan RoyalGarden " + (i+1) + ": Rp" + pendapatan);
        }
    }

    public static void tampilkanStokRoyalGarden4(int[][] stok) {
        int[] pengurangan = {1, 2, 0, 5};

        System.out.println("Stok di RoyalGarden4 setelah mempertimbangkan bunga mati:");
        for (int j = 0; j < stok[3].length; j++) {
            int stokTeradjust = stok[3][j] - pengurangan[j];
            System.out.println(stok[3][j] + " - " + pengurangan[j] + " = " + stokTeradjust);
        }
    }
}