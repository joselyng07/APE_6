import java.util.Locale;
import java.util.Scanner;

/**
 * Ejercicio 2 (Parte 1): Filtro y suma condicionada de produccion.
 */
public class Ejercicio2_ProduccionPiezas {

    static final int TURNOS = 10;

    // Lee la cantidad de piezas fabricadas por turno
    static void leerProduccion(int[] piezas, Scanner sc) {
        for (int i = 0; i < piezas.length; i++) {
            System.out.print("Piezas fabricadas en el turno " + (i + 1) + ": ");
            piezas[i] = sc.nextInt();
        }
    }

    // Suma solo las piezas ubicadas en indices pares (0, 2, 4...)
    static int sumaIndicesPares(int[] piezas) {
        int suma = 0;
        for (int i = 0; i < piezas.length; i += 2) {
            suma += piezas[i];
        }
        return suma;
    }

    // Cuenta los turnos con cantidad impar Y mayor a 15
    static int contarImparesMayoresA15(int[] piezas) {
        int cont = 0;
        for (int p : piezas) {
            if (p % 2 != 0 && p > 15) {
                cont++;
            }
        }
        return cont;
    }

    // Promedio general (se divide como double para no perder decimales)
    static double promedio(int[] piezas) {
        int total = 0;
        for (int p : piezas) {
            total += p;
        }
        return (double) total / piezas.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] piezas = new int[TURNOS];

        leerProduccion(piezas, sc);

        int suma = sumaIndicesPares(piezas);
        int turnos = contarImparesMayoresA15(piezas);
        double prom = promedio(piezas);

        System.out.println("\nSuma de piezas en indices pares: " + suma);
        System.out.println("Turnos con cantidad impar y mayor a 15: " + turnos);
        System.out.printf(Locale.US, "Promedio general de produccion: %.2f%n", prom);
        sc.close();
    }
}
