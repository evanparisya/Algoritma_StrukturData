public class DaftarNilaiMhs {
    Mahasiswa[]listnilai;
    int idx;

    public DaftarNilaiMhs() {
        listnilai = new Mahasiswa[17];
        idx = 0;
    }

    void tampil() {
        for (int i = 0; i < listnilai.length; i++) {
            listnilai[i].tampildata();
        }
    }

    void tambah(Mahasiswa m){
        if (idx<listnilai.length) {
            listnilai[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh!!");
        }
    }
    // method FindBinarySearh
    public int FindBinarySearch1(int cari, int left, int right) {
        if (right>=left) {
            int mid = left + (right - left) / 2;
            if (cari==listnilai[mid].nilai) {
                return mid;
            }
            if (cari<listnilai[mid].nilai) {
                return FindBinarySearch1(cari, left, mid-1);
            }
            return FindBinarySearch1(cari, mid+1, right);
        } else {
            return -1;
        }
    }

    public int FindBinarySearch2(int cari, int left, int right) {
        if (right>=left) {
            int mid = left + (right - left) / 2;
            if (cari==listnilai[mid].nilai) {
                return mid;
            }
            if (cari>listnilai[mid].nilai) {
                return FindBinarySearch2(cari, left, mid-1);
            }
            return FindBinarySearch2(cari, mid+1, right);
        } else {
            return -1;
        }
    }

    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data: "+ x + " ditemukan pada index: "+ pos);
        } else {
            System.out.println("Data: "+ x + "data tidak ditemukan");
        }
    }

    // method selectionSort
    void selectionSort1() {
        for (int i = 0; i < listnilai.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < listnilai.length-i; j++) {
                if (listnilai[j].nilai < listnilai[idxMin].nilai) {
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa tmp = listnilai[idxMin];
            listnilai[idxMin] = listnilai[i];
            listnilai[i] = tmp;
        }
    }

    void selectionSort2() {
        for (int i = 0; i < listnilai.length; i++) {
            int idxMin = i;
            for (int j = i+1; j < listnilai.length-i; j++) {
                if (listnilai[j].nilai > listnilai[idxMin].nilai) {
                    idxMin = j;
                }
            }
            //swap
            Mahasiswa tmp = listnilai[idxMin];
            listnilai[idxMin] = listnilai[i];
            listnilai[i] = tmp;
        }
    }
}
