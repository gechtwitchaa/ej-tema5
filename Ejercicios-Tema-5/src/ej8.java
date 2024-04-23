import java.util.Random;

public class ej8 {
    public static void main(String[] args) {

        int longitudCadena = 1000;

        String cadenaADN = generarCadenaADNAleatoria(longitudCadena);

        int numGenes = contarGenes(cadenaADN);

        System.out.println("Número de genes en la cadena de ADN: " + numGenes);
    }
    private static String generarCadenaADNAleatoria(int longitud) {
        StringBuilder cadena = new StringBuilder();
        Random random = new Random();
        String bases = "ACGT"; // Bases de ADN

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(bases.length());
            cadena.append(bases.charAt(indice));
        }

        return cadena.toString();
    }

    private static int contarGenes(String cadenaADN) {
        int contadorGenes = 0;
        int indiceInicio = 0;

        while (indiceInicio < cadenaADN.length() - 2) {
            int indiceATG = cadenaADN.indexOf("ATG", indiceInicio);

            if (indiceATG == -1) {
                break;
            }

            contadorGenes++;

            indiceInicio = indiceATG + 3;
        }

        return contadorGenes;
    }
}

