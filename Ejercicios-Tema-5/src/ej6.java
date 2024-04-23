public class ej6 {
    public static int hexadecimalToDecimal(String hex, int longitud) {

        return hexadecimalToDecimalRecursivo(hex, longitud - 1, 0);
    }

    private static int hexadecimalToDecimalRecursivo(String hex, int indice, int resultado) {

        if (indice == -1) {
            return resultado;
        }


        char caracter = hex.charAt(indice);
        int valor;


        if (Character.isDigit(caracter)) {
            valor = caracter - '0';
        } else {
            valor = Character.toUpperCase(caracter) - 'A' + 10;
        }

        resultado += valor * Math.pow(16, hex.length() - 1 - indice);


        return hexadecimalToDecimalRecursivo(hex, indice - 1, resultado);
    }

    public static void main(String[] args) {
        String hexadecimal = "1A7F";
        int longitud = hexadecimal.length();
        int decimal = hexadecimalToDecimal(hexadecimal, longitud);
        System.out.println("El valor decimal de " + hexadecimal + " es: " + decimal);
    }
}
