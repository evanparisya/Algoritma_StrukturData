/**
 * PostfixMain09
 */
import java.util.Scanner;
 public class PostfixMain09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix) : ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();

        Postfix09 post = new Postfix09(total);
        P = post.konversi(Q);
        System.out.println("Posftix: " + P);
    }
}