
/**
 * Faktorial
 */
public class Faktorial {

    int nilai;

    public Faktorial() {

    }

    public Faktorial(int nilai) {
        this.nilai = nilai;
    }

    public int faktorialBF(int n) {
        int fakto = 1;
        for (int i = n; i > 0; i--) {
            fakto *= i;
        }
        return fakto;
    }

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n-1);
            return fakto;
        }
    }
}


