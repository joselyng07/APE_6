import java.util.Locale;

/**
 * Ejercicio 5 (Parte 2): Maximo y minimo con arreglos paralelos.
 */
public class Ejercicio5_MaxMinParalelos {

    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Marta", "Pedro"};
        int[] notas = {15, 8, 18, 11};

        int posMax = 0;
        int posMin = 0;
        int suma = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > notas[posMax]) {
                posMax = i;
            }
            if (notas[i] < notas[posMin]) {
                posMin = i;
            }
            suma += notas[i];
        }

        double promedio = (double) suma / notas.length;

        System.out.println("Nota mas alta: " + nombres[posMax] + " con " + notas[posMax]);
        System.out.println("Nota mas baja: " + nombres[posMin] + " con " + notas[posMin]);
        System.out.printf(Locale.US, "Promedio: %.2f%n", promedio);
    }
}
