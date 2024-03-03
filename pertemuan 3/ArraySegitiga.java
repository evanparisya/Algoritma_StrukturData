import java.util.Scanner;

class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t)
    {
        alas = a;
        tinggi = t;
    }

    public double hitungLuas()
    {
        return 0.5 * alas * tinggi;
    }

    public int hitungKeliling()
    {
        return alas + alas + alas;
    }
}

public class ArraySegitiga {
    public static void main(String[] args) {


        Segitiga [] sgArray = new Segitiga[4];

        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        double luas = sgArray[0].hitungLuas();

        int keliling = sgArray[0].hitungKeliling();

        System.out.println("Hasil dari luas tersebut adalah " + luas);
        System.out.println("Hasil dari kelilling tersebut adalah " + keliling);

        for (int i = 0; i < sgArray.length; i++) 
        {
            System.out.println("Segitiga ke-" + (i+1) + ":");
            System.out.println("Alas: " + sgArray[i].alas);
            System.out.println("Tinggi: " + sgArray[i].tinggi);
            System.out.println("Luas: " + sgArray[i].hitungLuas());
            System.out.println("Keliling: " + sgArray[i].hitungKeliling());
            System.out.println();
        }
    }    
}



