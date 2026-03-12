import lib.in;

import static java.lang.Math.random;
import static java.lang.Math.round;

public class sumaDesde_Ej7 {
    public static void main(String[] args) {
        double[] array = new double[20];
        generarArray(array);
        mostrarelArray(array);
        System.out.println();
        int desde = in.leerInt("Escribe la posicion desde donde tienes que empezar a sumar: ", v -> v >= 0 && v <= 20);
        int hasta = in.leerInt("Escribe la posicion desde donde tienes que empezar a sumar: ", v -> v >= 0 && v <= 20);
        SumaDesdeHasta(array, desde, hasta);

    }

    private static void mostrarelArray(double[] array) {
        for (double valor : array) {
            System.out.println("Valor: " + valor);
        }

    }

    private static double generarArray(double[] array) {
        double arrayRedondeado = 0.0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (random() * 10.0);
            array[i] = round(array[i] * 10.0 / 10.0);
        }
        return arrayRedondeado;
    }

    public static double SumaDesdeHasta(double[] array, int desde, int hasta) {

        double acumulador = 0.0;
        for (int i = desde; i <= hasta; i++) {
            acumulador = acumulador + array[i];


        }
        System.out.println("Se ha sumado desde " + desde + " Hasta " + hasta + "y el resultado es: " + acumulador);
        return acumulador;
    }

}


