public class LinkedList {
    Node head;
    Node tail;
    
    boolean isEmpty() {
        if (head != null) {
            return false;
        } else {
            return true;
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Data Mahasiswa");
            System.out.println("Antrian\t\tNIM\t\tNama");
            System.out.println("-------------------------");
            int i = 1;
            while (tmp != null) {
                System.out.println(i +"\t\t" + tmp.data.nim + "\t\t" + tmp.data.nama + "\t");
                tmp = tmp.next;
                i++;
            }
            System.out.println("");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
            System.out.println("Antrian berhasil dikeluarkan");
        } else if (head == tail) {
            head = tail = null;
            System.out.println("Antrian berhasil dikeluarkan");
        } else {
            System.out.println("Antrian masih kosong" + "tidak dapat dihapus");
        }
    }

    public void addLast (Mahasiswa input) {
        Node ndInput = new Node(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
        System.out.println("Antrian berhasil ditambahkan");
    }

    Mahasiswa getData (int index) {
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void peekData (int i) {
        if (i == 1) {
            System.out.println("Antrian paling depan : " + head.data.nim + " " + head.data.nama);
        } else if (i == 2) {
            System.out.println("Antrian paling belakang : " + tail.data.nim + " " + tail.data.nama);
        }
    }

    int indexOf (String key) {
        Node tmp = head;
        int index = 0;
        while (tmp !=null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            return 1;
        } else {
            return index + 1;
        }
    }
}
