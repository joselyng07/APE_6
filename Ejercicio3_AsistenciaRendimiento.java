import java.util.Locale;
import java.util.Scanner;

/**
 * Ejercicio 3 (Parte 1): Analisis de asistencia y rendimiento.
 */
public class Ejercicio3_AsistenciaRendimiento {

    static final double NOTA_APROBACION = 14;

    // Llena el arreglo validando que cada nota este entre 0 y 20
    static void leerNotas(int[] notas, Scanner sc) {
        for (int i = 0; i < notas.length; i++) {
            int nota;
            do {
                System.out.print("Nota del Estudiante " + (i + 1) + " (0-20): ");
                nota = sc.nextInt();
                if (nota < 0 || nota > 20) {
                    System.out.println("  Nota invalida. Intente de nuevo.");
                }
            } while (nota < 0 || nota > 20);
            notas[i] = nota;
        }
    }

    // Promedio general evitando la division entera
    static double promedio(int[] notas) {
        int suma = 0;
        for (int n : notas) {
            suma += n;
        }
        return (double) suma / notas.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de estudiantes del curso: ");
        int n = sc.nextInt();
        int[] notas = new int[n];

        leerNotas(notas, sc);

        double prom = promedio(notas);
        int aprobados = 0;
        int reprobados = 0;
        for (int nota : notas) {
            if (nota >= NOTA_APROBACION) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        System.out.printf(Locale.US, "%nPromedio general del curso: %.2f%n", prom);
        System.out.println("Estudiantes aprobados (>= 14): " + aprobados);
        System.out.println("Estudiantes reprobados: " + reprobados);

        System.out.println("\nEstudiantes con nota por debajo del promedio:");
        boolean hay = false;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < prom) {
                System.out.println("Estudiante " + (i + 1) + " (nota " + notas[i] + ")");
                hay = true;
            }
        }
        if (!hay) {
            System.out.println("Ninguno");
        }
        sc.close();
    }
}
