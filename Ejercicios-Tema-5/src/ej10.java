import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ej10 {
    public static void main(String[] args) {
        String archivo = "archivo.txt";
        String palabraBuscada = "palabra";

        try {
            buscarPalabraEnArchivo(archivo, palabraBuscada);
        } catch (IOException e) {
            System.out.println("Se produjo un error al leer el archivo: " + e.getMessage());
        }
    }
    private static void buscarPalabraEnArchivo(String archivo, String palabraBuscada) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int numeroLinea = 0;

            while ((linea = br.readLine()) != null) {
                numeroLinea++;

                String[] palabras = linea.split("\\s+");

                for (String palabra : palabras) {
                    if (palabra.equalsIgnoreCase(palabraBuscada)) {
                        System.out.println("Se encontró la palabra '" + palabraBuscada + "' en la línea " + numeroLinea + ":");
                        System.out.println(linea);
                        break;
                    }
                }
            }
        }
    }
}
