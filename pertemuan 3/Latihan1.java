import java.util.Scanner;
import java.lang.Math;

    class kerucut {
        public double jariJari, sisiMiring;
    
        public kerucut(double r, double sm) {
            jariJari = r;
            sisiMiring = sm;
        }
    
        public double hitungLuasPermukaan() {
            return 3.14 * jariJari * (jariJari + sisiMiring);
        }
    
        public double hitungVolume() {
            double t = Math.sqrt((sisiMiring * sisiMiring) - (jariJari * jariJari));
            return 0.33 * 3.14 * jariJari * jariJari * t;
        }
    }
    
    class limas {
        public double sisiAlas, tinggi;
    
        public limas(double s,double t) {
            sisiAlas = s;
            tinggi = t;
        }
    
        public double hitungLuasPermukaan() {
            double luasAlas = sisiAlas * sisiAlas;
            double luasSisiTegak = 0.5 * sisiAlas * tinggi;
            return luasAlas + (4 * luasSisiTegak);
        }
    
        public double hitungVolume() {
            double luasAlas = sisiAlas * sisiAlas;
            return 0.33 * luasAlas * tinggi;
        }
    }
    
    class bola {
        public double jariJari ;
    
        public bola(double r) {
            jariJari = r;
        }
    
        public double hitungLuasPermukaan() {
            return 4 * 3.14 * jariJari * jariJari;
        }
    
        public double hitungVolume() {
            return 1.33 * 3.14 * jariJari * jariJari * jariJari;
        }
    }

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jari-jari kerucut: ");
        double rKerucut = sc.nextDouble();
        System.out.print("Masukkan sisi miring kerucut: ");        
        double smKerucut = sc.nextDouble();
        
        kerucut k = new kerucut(rKerucut, smKerucut);        
        System.out.println("Luas permukaan kerucut: " + k.hitungLuasPermukaan());
        System.out.println("Volume kerucut: " + k.hitungVolume());
        
        System.out.print("Masukkan sisi alas limas: ");
        double sLimas = sc.nextDouble();
        System.out.print("Masukkan tinggi limas: ");        
        double tLimas = sc.nextDouble();
        
        limas l = new limas(sLimas, tLimas);
        System.out.println("Luas permukaan limas: " + l.hitungLuasPermukaan());
        System.out.println("Volume limas: " + l.hitungVolume());
        
        System.out.print("Masukkan jari-jari bola: ");
        double rBola = sc.nextDouble();
        
        bola b = new bola(rBola);
        System.out.println("Luas permukaan bola: " + b.hitungLuasPermukaan());
        System.out.println("Volume bola: " + b.hitungVolume());
    }
}    