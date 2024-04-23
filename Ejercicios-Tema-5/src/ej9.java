import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class ej9{
    public static void main(String[] args) {
        String archivoEntrada = "archivo.txt";
        String archivoSalida = "archivo_ordenado.txt";

        try {
            TreeSet<String> lineasOrdenadas = leerLineasOrdenadas(archivoEntrada);

            escribirLineasOrdenadas(lineasOrdenadas, archivoSalida);

            System.out.println("Las líneas del archivo se han ordenado alfabéticamente correctamente.");
        } catch (IOException e) {
            System.out.println("Se produjo un error al leer o escribir el archivo: " + e.getMessage());
        }
    }
    private static TreeSet<String> leerLineasOrdenadas(String archivo) throws IOException {
        TreeSet<String> lineasOrdenadas = new TreeSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineasOrdenadas.add(linea); // Agregar la línea al TreeSet
            }
        }

        return lineasOrdenadas;
    }

    private static void escribirLineasOrdenadas(TreeSet<String> lineasOrdenadas, String archivo) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (String linea : lineasOrdenadas) {
                bw.write(linea);
                bw.newLine();
            }
        }
    }
}
