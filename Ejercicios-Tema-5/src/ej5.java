public class ej5 {
    public static int encontrarMaximo(int[] vector) {
        return encontrarMaximoRecursivo(vector, 0, vector.length - 1);
    }

    private static int encontrarMaximoRecursivo(int[] vector, int inicio, int fin) {

        if (inicio == fin) {
            return vector[inicio];
        }

        int medio = (inicio + fin) / 2;

        int maximoIzquierda = encontrarMaximoRecursivo(vector, inicio, medio);

        int maximoDerecha = encontrarMaximoRecursivo(vector, medio + 1, fin);

        return Math.max(maximoIzquierda, maximoDerecha);
    }

    public static void main(String[] args) {
        int[] vector = {12, 34, 56, 78, 90, 23, 45, 67};
        int maximo = encontrarMaximo(vector);
        System.out.println("El valor máximo en el vector es: " + maximo);
    }
}
