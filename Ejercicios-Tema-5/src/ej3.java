public class ej3 {
    public static int contarDigitos(int numero) {
        if (numero < 10) {
            return 1;
        }
        return 1 + contarDigitos(numero / 10);
    }

    public static void main(String[] args) {
        int numero = 12345;
        int cantidad = contarDigitos(numero);
        System.out.println("El número " + numero + " tiene " + cantidad + " dígitos.");
    }
}
