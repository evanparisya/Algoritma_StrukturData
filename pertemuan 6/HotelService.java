public class HotelService {
    Hotel listHotel[] = new Hotel[5];
    int idx;
    void tambah(Hotel h) {
        if (idx < listHotel.length) {
            listHotel[idx] = h;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Hotel h : listHotel) {
            h.tampil();
            System.out.println("----------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listHotel.length-1; i++) {
            for (int j = 1; j < listHotel.length-i; j++) {
                if (listHotel[j].harga > listHotel[j-1].harga) {
                    Hotel tmp = listHotel[j];
                    listHotel[j] = listHotel[j-1];
                    listHotel[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listHotel.length-1; i++) {
            int idxMin = 1;
            for (int j = i+1; j < listHotel.length-i; j++) {
                if (listHotel[j].bintang < listHotel[idxMin].bintang) {
                    idxMin = j;
                }
            }
            Hotel tmp = listHotel[idxMin];
            listHotel[idxMin] = listHotel[i];
            listHotel[i] = tmp;
        }
    }
}
