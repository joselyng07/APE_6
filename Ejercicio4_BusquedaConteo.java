import java.util.Scanner;

/**
 * Ejercicio 4 (Parte 2): Busqueda y conteo en un arreglo.
 */
public class Ejercicio4_BusquedaConteo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {14, 7, 25, 3, 18, 7, 30};

        System.out.print("Ingrese el numero a buscar: ");
        int buscado = sc.nextInt();

        int conteo = 0;
        int posicion = -1; // -1 indica que no se ha encontrado

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                conteo++;
                if (posicion == -1) {
                    posicion = i; // solo se guarda la primera aparicion
                }
            }
        }

        if (posicion == -1) {
            System.out.println("No existe");
        } else {
            System.out.println("El numero " + buscado + " aparece "
                    + conteo + " vez/veces.");
            System.out.println("Primera posicion: " + posicion);
        }
        sc.close();
    }
}
