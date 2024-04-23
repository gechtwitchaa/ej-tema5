import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ej11 {
    public static void main(String[] args) {
        String archivo = "archivo.txt";
        String palabraBuscada = "palabra";

        try {
            buscarPalabraConBusquedaBinaria(archivo, palabraBuscada);
        } catch (IOException e) {
            System.out.println("Se produjo un error al leer el archivo: " + e.getMessage());
        }
    }


    private static void buscarPalabraConBusquedaBinaria(String archivo, String palabraBuscada) throws IOException {
        List<String> lineasOrdenadas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineasOrdenadas.add(linea);
            }
        }
        Collections.sort(lineasOrdenadas);

        int indice = busquedaBinaria(lineasOrdenadas, palabraBuscada);
        if (indice != -1) {
            System.out.println("Se encontró la palabra '" + palabraBuscada + "' en la línea " + (indice + 1) + ":");
            System.out.println(lineasOrdenadas.get(indice));
        } else {
            System.out.println("La palabra '" + palabraBuscada + "' no se encontró en el archivo.");
        }
    }
    private static int busquedaBinaria(List<String> lista, String palabraBuscada) {
        int inicio = 0;
        int fin = lista.size() - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            String palabraMedia = lista.get(medio);

            int comparacion = palabraMedia.compareToIgnoreCase(palabraBuscada);


            if (comparacion > 0) {
                fin = medio - 1;
            }

            else if (comparacion < 0) {
                inicio = medio + 1;
            }

            else {
                return medio;
            }
        }

        return -1;
    }
}

