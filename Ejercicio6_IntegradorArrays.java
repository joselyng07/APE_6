import java.util.Arrays;

/**
 * Ejercicio 6 (Parte 2): Integrador con java.util.Arrays.
 */
public class Ejercicio6_IntegradorArrays {

    public static void main(String[] args) {
        int[] datos = {14, 7, 25, 3, 18};

        // Copia real: un arreglo nuevo e independiente del original
        int[] copia = Arrays.copyOf(datos, datos.length);

        // Se ordena solo la copia
        Arrays.sort(copia);

        System.out.println("Original: " + Arrays.toString(datos));
        System.out.println("Copia ordenada: " + Arrays.toString(copia));

        // En un arreglo ordenado ascendente, el segundo mayor esta en length - 2
        System.out.println("Segundo numero mayor: " + copia[copia.length - 2]);

        // binarySearch solo es valido sobre un arreglo ordenado (la copia)
        int pos = Arrays.binarySearch(copia, 14);
        System.out.println("Posicion del 14 en la copia: " + pos);
    }
}
