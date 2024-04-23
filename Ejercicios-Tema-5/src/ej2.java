
    import java.util.Scanner;

    public class ej2 {
        public static void imprimirNaturalesEntre(int a, int d) {
            if (a > d) {
                return;
            }

            System.out.print(a + " ");
            imprimirNaturalesEntre(a + 1, d);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese el primer valor (a): ");
            int a = scanner.nextInt();

            System.out.print("Ingrese el segundo valor (d): ");
            int d = scanner.nextInt();

            System.out.println("Números naturales entre " + a + " y " + d + ":");
            imprimirNaturalesEntre(a, d);
        }
    }


