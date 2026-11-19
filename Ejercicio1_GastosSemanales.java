import java.util.Locale;
import java.util.Scanner;

/**
 * Ejercicio 1 (Parte 1): Control de gastos semanales y ajuste por inflación.
 */
public class Ejercicio1_GastosSemanales {

    static final int DIAS = 7;
    static final double INCREMENTO = 0.10; // 10 %

    // Registra los gastos diarios en el arreglo
    static void leerGastos(double[] gastos, Scanner sc) {
        for (int i = 0; i < gastos.length; i++) {
            System.out.print("Gasto del dia " + (i + 1) + ": $");
            gastos[i] = sc.nextDouble();
        }
    }

    // Recorre el arreglo y acumula el gasto total
    static double calcularTotal(double[] gastos) {
        double total = 0;
        for (double g : gastos) {
            total += g;
        }
        return total;
    }

    // Aplica el 10 % solo a los dias sobre el promedio; devuelve cuantos fueron
    static int aplicarInflacion(double[] gastos, double promedio) {
        int diasAjustados = 0;
        for (int i = 0; i < gastos.length; i++) {
            if (gastos[i] > promedio) {
                gastos[i] = gastos[i] * (1 + INCREMENTO);
                diasAjustados++;
            }
        }
        return diasAjustados;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double[] gastos = new double[DIAS];

        leerGastos(gastos, sc);

        double total = calcularTotal(gastos);
        double promedio = total / DIAS;
        System.out.printf(Locale.US, "%nGasto total: $%.2f%n", total);
        System.out.printf(Locale.US, "Promedio diario: $%.2f%n", promedio);

        int ajustados = aplicarInflacion(gastos, promedio);

        System.out.println("\nArreglo actualizado (orden inverso):");
        for (int i = gastos.length - 1; i >= 0; i--) {
            System.out.printf(Locale.US, "Dia %d: $%.2f%n", i + 1, gastos[i]);
        }
        System.out.println("\nDias que sufrieron el incremento del 10%: " + ajustados);
        sc.close();
    }
}
