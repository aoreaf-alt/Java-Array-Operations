import java.util.Arrays;

import static java.lang.Math.random;
import static java.lang.Math.round;

public class sumaDesde_Ej7 {
    public static void main(String[] args) {
        double[] array = new double[20];
        generarArray(array);
        mostrarelArray(array);

        double valor = 3.14159;
        valor = round((valor) * 100.0) / 100.0;
        System.out.println(valor);
    }

    private static void mostrarelArray(double[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static double generarArray(double[] array) {
        double arrayRedondeado = 0.0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (random() * 10.0);
            array[i] = (round(array[i] * 100.00) / 100.00);
        }
        return arrayRedondeado;
    }


}


