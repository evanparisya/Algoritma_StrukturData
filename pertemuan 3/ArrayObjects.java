import java.util.Scanner;

class Persegipanjang {
    public int panjang;
    public int lebar;

}
public class ArrayObjects {


public static void main(String[] args) {
    Persegipanjang[] ppArray = new Persegipanjang[3];
  
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan length array: ");
    int arrayLength = sc.nextInt();

    for(int i = 0; i < 3; i++)
    {
        ppArray[i] = new Persegipanjang();
        System.out.print("Persegi panjang ke-" + i);
        System.out.print("Masukkan panjang: ");
        ppArray[i].panjang = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        ppArray[i].lebar = sc.nextInt();
    }
  
    for(int i = 0; i < 3; i++)
    {
        System.out.println("Persegi Panjang ke-" + i);
        System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
    }
  
}
}