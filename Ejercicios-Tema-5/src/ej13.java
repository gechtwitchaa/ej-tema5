public class ej13{
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int inicio, int fin) {
        if (inicio < fin) {
            int indiceParticion = particionHoare(arr, inicio, fin);
            quickSort(arr, inicio, indiceParticion);
            quickSort(arr, indiceParticion + 1, fin);
        }
    }

    private static int particionHoare(int[] arr, int inicio, int fin) {
        int pivote = arr[inicio];
        int i = inicio - 1;
        int j = fin + 1;

        while (true) {
            do {
                i++;
            } while (arr[i] < pivote);

            do {
                j--;
            } while (arr[j] > pivote);

            if (i >= j) {
                return j;
            }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 9, 2, 4, 6, 8, 10, 1, 11};
        quickSort(arr);
        System.out.println("Arreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
