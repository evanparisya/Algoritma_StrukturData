import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 && i != 6 && i != 10) {
                System.out.print(i + " ");
            }
            else if (i != 6 && i != 10) {
                System.out.print("* ");
            }
        }
    }
}