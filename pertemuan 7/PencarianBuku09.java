public class PencarianBuku09 {
    Buku09 [] listBK = new Buku09[5];
    int idx;

    void tambahBuku( Buku09 m){
        if(idx < listBK.length){
            listBK[idx]=m;
            idx++;
        }else{
            System.out.println("Data Sudah Penuh");
        }
    }

    public void tampil(){
        for (Buku09 m : listBK){
            m.tampilDataBuku();
        }
    }

    public int FindSeqSearch(String cari){
        int posisi = -1;
        for (int j = 0 ; j <listBK.length; j++){
            if (listBK[j].kodeBuku.equals(cari)){
                posisi = j;
                break;
            }    
        }
        return posisi;
    }
    
    public void tampilPosisi(String x, int pos) { 
        if (pos != -1) {
            System.out.println("Data: "+ x +" ditemukan pada indeks "+ pos);
        } else {
            System.out.println("Data: "+ x + " tidak ditemukan!");
        }
    }

    public void TampilData (String x, int pos){
        if (pos != -1){
            System.out.println("Kode Buku : " + x);
            System.out.println("Judul : " + listBK[pos].judulBuku);
            System.out.println("Tahun Terbit : " + listBK[pos].tahunTerbit);
            System.out.println("Pengarang : " + listBK[pos].pengarang);
            System.out.println("Stok : " + listBK[pos].stock);
        }else {
            System.out.println("Data " + x + " tidak ditemukan!!");
        }
    }

  
    public Buku09 FindBuku(String cari) {
        int posisi =-1;
        for (int j = 0; j < listBK.length; j++) {
            if (listBK[j].kodeBuku.equals(cari)) {
                posisi = j;
                break;

            }
        }
        return listBK[posisi];
    }

    public int FindBinarySearch(String cari, int left, int right){
        int mid;
        if (right >= left){
            mid = left + (right - left) / 2;
            if ( cari.equals(listBK[mid].kodeBuku)){
                return mid;
            }else if (listBK[mid].kodeBuku.compareTo(cari) > 0){
                return FindBinarySearch(cari, left, mid -1);
            }else {
                return FindBinarySearch (cari, mid +1, right);
            }
        }
        return -1;
    }

    public int findJudulSequential(String judul) {
        int posisi = -1;
        for (int j = 0; j < listBK.length; j++) {
            if (listBK[j].judulBuku.equals(judul)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    private void bubbleSortByJudul() {
        for (int i = 0; i < listBK.length - 1; i++) {
            for (int j = 0; j < listBK.length - i - 1; j++) {
                if (listBK[j].judulBuku.compareTo(listBK[j + 1].judulBuku) > 0) {
                    Buku09 temp = listBK[j];
                    listBK[j] = listBK[j + 1];
                    listBK[j + 1] = temp;
                }
            }
        }
    }

    public int findJudulBinary(String judul) {
        bubbleSortByJudul(); 
        int left = 0;
        int right = listBK.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compareResult = listBK[mid].judulBuku.compareTo(judul);
            if (compareResult == 0) {
                return mid;
            } else if (compareResult < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;    
    }
}