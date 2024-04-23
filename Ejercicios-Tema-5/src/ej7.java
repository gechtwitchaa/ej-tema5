public class ej7 {
    public static int coeficienteBinomial(int n, int k) {

        if (k == 0 || k == n) {
            return 1;
        }

        return coeficienteBinomial(n - 1, k) + coeficienteBinomial(n - 1, k - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        int resultado = coeficienteBinomial(n, k);
        System.out.println("C(" + n + ", " + k + ") = " + resultado);
    }
}
