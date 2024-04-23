public class ej1 {
    public static int sumaNaturales(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            return n + sumaNaturales(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int resultado = sumaNaturales(n);
        System.out.println("La suma de los primeros " + n + " números naturales es: " + resultado);
    }
}
