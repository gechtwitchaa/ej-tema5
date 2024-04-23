import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Fecha {
    int dia;
    int mes;
    int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, anio);
    }
}

public class ej12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Fecha> fechas = new ArrayList<>();

        System.out.println("Introduce las fechas en formato DD/MM/AAAA (introduce 'fin' para terminar):");
        while (true) {
            System.out.print("> ");
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("fin")) {
                break;
            }

            String[] partes = entrada.split("/");
            if (partes.length != 3) {
                System.out.println("Formato de fecha incorrecto. Debe ser DD/MM/AAAA.");
                continue;
            }

            try {
                int dia = Integer.parseInt(partes[0]);
                int mes = Integer.parseInt(partes[1]);
                int anio = Integer.parseInt(partes[2]);
                fechas.add(new Fecha(dia, mes, anio));
            } catch (NumberFormatException e) {
                System.out.println("Formato de fecha incorrecto. Debe ser DD/MM/AAAA.");
            }
        }

        Collections.sort(fechas, new Comparator<Fecha>() {
            @Override
            public int compare(Fecha f1, Fecha f2) {
                if (f1.anio != f2.anio) {
                    return Integer.compare(f1.anio, f2.anio);
                }
                if (f1.mes != f2.mes) {
                    return Integer.compare(f1.mes, f2.mes);
                }
                return Integer.compare(f1.dia, f2.dia);
            }
        });

        System.out.println("Fechas ordenadas cronológicamente:");
        for (Fecha fecha : fechas) {
            System.out.println(fecha);
        }

        scanner.close();
    }
}
