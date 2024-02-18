import java.util.Scanner;

public class pemilihan{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // input nilai
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=============================");
        System.out.print("Masukkan nilai tugas: ");  
        int tugas = input.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int kuis = input.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int uts = input.nextInt(); 
        System.out.print("Masukkan nilai UAS: ");
        int uas = input.nextInt();
        
        // validasi input
        if(tugas < 0 || tugas > 100 || 
           kuis < 0 || kuis > 100 ||
           uts < 0 || uts > 100 ||
           uas < 0 || uas > 100){
            System.out.println("Nilai tidak valid");
        }
        else {
            // hitung nilai akhir
            double na = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.4);
            
            // konversi ke nilai huruf
            String nh;
            if(80 < na && na <= 100){
                nh = "A";
            }
            else if(73 < na && na <= 80){
                nh = "B+"; 
            }
            else if(65 < na && na <= 73){
                nh = "B";
            }
            else if(60 < na && na <= 65){
                nh = "C+";
            }
            else if(50 < na && na <= 60){
                nh = "C"; 
            }
            else if(39 < na && na <= 50){
                nh = "D";
            }  
            else {
                nh = "E";
            }
            
            // cek kelulusan
            String status;
            if(nh.equals("A") || nh.equals("B+") || nh.equals("B") ||  
               nh.equals("C+") || nh.equals("C")){
                status = "SELAMAT ANDA LULUS"; 
            }
            else {
                status = "TIDAK LULUS";
            }
            
            // tampilkan output
            System.out.println("=============================");
            System.out.println("=============================");
            System.out.println("Nilai akhir: " + na); 
            System.out.println("Nilai huruf: " + nh);
            System.out.println("=============================");
            System.out.println("=============================");
            System.out.println(status);
        }
        
        input.close();
    }
}