public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();

        Mahasiswa mhs1 = new Mahasiswa("Anton", 111);
        Mahasiswa mhs2 = new Mahasiswa("Prita", 112);
        Mahasiswa mhs3 = new Mahasiswa("Yusuf", 113);
        Mahasiswa mhs4 = new Mahasiswa("Doni", 114);
        Mahasiswa mhs5 = new Mahasiswa("Sari", 115);
        
        singLL.addFirst(mhs1);
        singLL.print();
        singLL.addLast(mhs3);
        singLL.print();
        singLL.insertAt(1, mhs2);
        singLL.print();
        singLL.addLast(mhs5);
        singLL.print();
        singLL.insertAfter(113, mhs4);
        singLL.print();

    }
}
