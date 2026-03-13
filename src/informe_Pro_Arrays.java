public class informe_Pro_Arrays {
    public static void main(String[] args) {
        int[] arrayOriginal = new int[crearTamaño()];
        rellenarArray(arrayOriginal);

        // Apartado e) del examen: Obtenemos los tres arrays
        int[] unoDigito = obtenerValoresPorDigitos(arrayOriginal, 1);
        int[] dosDigitos = obtenerValoresPorDigitos(arrayOriginal, 2);
        int[] tresDigitos = obtenerValoresPorDigitos(arrayOriginal, 3);

        // Mostramos todo usando tu método mostrarArray
        System.out.println("ORIGINAL:");
        mostrarArray(arrayOriginal);
        System.out.println("\n1 DIGITO:");
        mostrarArray(unoDigito);
        System.out.println("\n2 DIGITOS:");
        mostrarArray(dosDigitos);
        System.out.println("\n3 DIGITOS:");
        mostrarArray(tresDigitos);
    }

    private static int[] obtenerValoresPorDigitos(int[] array, int n) {
        // 1. Invocamos al método anterior para saber el tamaño (como pide el examen)
        int tamañoNuevo = tipoSalida(array, n);

        // 2. Creamos el array con el tamaño justo
        int[] resultado = new int[tamañoNuevo];

        // 3. Índice para saber en qué posición de la bandeja estamos colocando
        int j = 0;

        // 4. Volvemos a calcular los límites (o podrías pasarlos por parámetro)
        int inferior = (int) Math.pow(10, n - 1);
        int superior = (int) Math.pow(10, n) - 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= inferior && array[i] <= superior) {
                resultado[j] = array[i]; // Guardamos el número
                j++; // Avanzamos el hueco en la bandeja
            }
        }
        return resultado;
    }

    private static int tipoSalida(int[] array, int n) {
        int cuenta = 0;
        int inferior = (int) Math.pow(10, n - 1);
        int superior = (int) Math.pow(10, n) - 1;


        for (int i = 0; i < array.length; i++) {
            if (array[i] >= inferior && array[i] <= superior) {
                cuenta++;
            }
        }
        return cuenta;
    }

    private static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 999 + 1);
        }
    }

    private static void mostrarArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(":");
        }
        System.out.print("]");
    }

    public static int crearTamaño() {

        int tamaño = (int) (Math.random() * 91 + 10);
        return tamaño;
    }

}
