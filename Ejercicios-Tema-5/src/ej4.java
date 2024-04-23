public class ej4 {
    public static int calcularPotencia(int x, int y) {
        if (y == 0) {
            return 1;
        }
        else if (y > 0) {
            int temp = calcularPotencia(x, y / 2);
            if (y % 2 == 0) {
                return temp * temp;
            }
            else {
                return temp * temp * x;
            }
        }
        else {
            return 1 / calcularPotencia(x, -y);
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        int resultado = calcularPotencia(x, y);
        System.out.println(x + " elevado a " + y + " es igual a " + resultado);
    }
}
