import lib.in;

import static java.lang.Math.random;

/**
 * Simúlese el juego de la carrera de caballos introduciendo el número de caballos que
 * van a participar (como mínimo 2). Se tendrá un array que almacena el avance de cada
 * uno de los caballos. Se definirán los siguientes métodos:
 * • Leer el número de caballos
 * • Generar el caballo que avanza.
 * • Avanzar caballo
 * • Mostrar todos los caballos (limpiando previamente la pantalla)
 * • Detener el juego durante 1 segundo.
 * • Finalización del juego
 * • Mostrar el caballo ganador.
 * (CarreraCaballosArray
 */
public class metodos_ForEach_Ej6 {
    public static void main(String[] args) {
        final int caballoGanador = 20;
        boolean carreraTerminada = false;
        int[] caballos = new int[leerNumeroCaballos()];

        while (!carreraTerminada) {

            generarCaballoAvanza(caballos);
            limpiar();
            carreraTerminada = finalizarCarrera(caballos);
        }


    }

    private static boolean finalizarCarrera(int[] caballos) {
        for (int valor : caballos) {
            if (valor >= 20) return true;
        }
        return false;
    }


    private static void limpiar() {
        in.cls();
    }

    private static void generarCaballoAvanza(int[] caballos) {
        int indiceCaballos = (int) (random() * caballos.length);
        caballos[indiceCaballos] += 1;

    }

    public static int leerNumeroCaballos() {
        return in.leerInt("Leer Numero de caballos: ", v -> v >= 2);
    }

}
