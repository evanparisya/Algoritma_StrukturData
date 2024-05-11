/**
 * Tugas
 */
public class Pembeli {
    String nama;
    int noHP;

    public Pembeli (String nama, int noHP) {
        this.nama = nama;
        this.noHP = noHP;
    }

    Pembeli[] antrian;
    int front;
    int rear;
    int size;
    int max;

    Pembeli(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    void Enqueue(Tugas antri) {
        if (IsFull()) {
            System.out.println("Antrian sudah penuh");
            return;
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            antrian[rear] = antri;
            size++;
        }
    }

    public Pembeli Dequeue() {
        Pembeli antri = null;
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            antri = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
        return antri;
    }

    void Peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan : " + antrian[front].nama + " " + antrian[front].noHp);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    void PeekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen paling belakang : " + antrian[rear].nama + " " + antrian[rear].noHp);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    void DaftarPembeli() {
        if (IsEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHp);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    void PeekPosition(String nama) {
        int pos = -1;
        int i = front;
        while (i != (rear + 1) % max) {
            if (antrian[i].nama.equals(nama)) {
                pos = i;
                break;
            }
            i = (i + 1) % max;
        }
        if (pos >= 0) {
            System.out.println("Pelanggan yang anda cari berada pada posisi ke " + (pos - front + 1));
        } else {
            System.out.println("Pelanggan yang anda cari tidak ada");
        }
    }

    public void menu() {
        System.out.println("Pilihan menu :");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian belakang");
        System.out.println("6. Cari posisi pembeli");
        System.out.println("7. Keluar");
        System.out.println("---------------------------");
    }
}