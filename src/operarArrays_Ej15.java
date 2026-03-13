/**
 * . Se considera un array de 10 elementos con valores entre 0 y 99 aleatorios, y otro array
 * de las mismas características. Se mostrarán los dos arrays. Se podrán obtener los
 * siguientes arrays y valores:
 * a) El producto escalar (multiplicar los valores de los dos arrays que ocupan la
 * misma posición y sumarlos)
 * b) Sumar los dos arrays (array de 10 elementos cuyos elementos son la suma de
 * los elementos que ocupan la misma posición en los dos arrays)
 * c) Multiplicar los dos arrays (array de 10 elementos cuyos elementos son el
 * producto de los elementos que ocupan la misma posición en los dos arrays)
 */

public class operarArrays_Ej15 {
    public static void main(String[] args) {
        int[] arrayA = new int[10];
        int[] arrayB = new int[10];
        rellenarAleatorio(arrayA);
        rellenarAleatorio(arrayB);
        mostrarFormato(arrayA);
        System.out.println();
        mostrarFormato(arrayB);
        sumarArrays(arrayA, arrayB);
        producto(arrayA, arrayB);
        prooductoEscalar(arrayA, arrayB);
        invertirArray(arrayA);
    }

    private static void invertirArray(int[] arrayA) {
        for (int i = 0; i < arrayA.length / 2; i++) {
            int aux = arrayA[i]; // Paso 1: Guardamos el de la izquierdaq
            arrayA[i] = arrayA[arrayA.length - 1 - i]; // Paso 2: El de la derecha pasa a la izquierda
            arrayA[arrayA.length - 1 - i] = aux; // Paso 3: El aux pasa a la derecha
        }
    }

    private static int prooductoEscalar(int[] arrayA, int[] arrayB) {
        int acumulador = 0;
        for (int i = 0; i < arrayA.length; i++) {
            acumulador += (arrayA[i] * arrayB[i]);
        }
        System.out.println("El resultadoa escalar de los arrays es: " + acumulador);

        return acumulador;
    }

    private static int[] producto(int[] arrayA, int[] arrayB) {
        int[] producto = new int[10];
        for (int i = 0; i < producto.length; i++) {
            producto[i] = arrayA[i] * arrayB[i];
        }
        System.out.println("El resultado de los arrays es: ");
        mostrarFormato(producto);
        return producto;
    }

    private static int[] sumarArrays(int[] arrayA, int[] arrayB) {
        int[] suma = new int[10];
        for (int i = 0; i < suma.length; i++) {
            suma[i] = arrayA[i] + arrayB[i];
        }
        System.out.println("El resultado de los arrays es: ");
        mostrarFormato(suma);
        return suma;
    }

    public static void mostrarFormato(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(":");
        }
        System.out.println("]");
    }


    private static void rellenarAleatorio(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

}

