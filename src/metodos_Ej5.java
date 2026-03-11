import java.util.Arrays;

import static lib.in.leerDouble;

/***
 * Introdúzcase, una a una, 10 temperaturas entre los valores de -10.0 y 50.0. A medida
 * que se introducen se mostrarán todas, se obtendrán la menor y la mayor temperatura,
 * la media de las temperaturas con dos decimales, y la media con dos decimales sin
 * tener en cuenta las temperaturas máximas ni mínimas (puede ser que no se pueda
 * obtener dicha media). Se tendrán los siguientes métodos:
 * • leer (temperatura validándola)
 * • rellenar (temperaturas)
 * • mostrar (todas las temperaturas)
 * • mayor (temperatura)
 * • menor (temperatura)
 * • media (de todas las temperaturas)
 * • mediaSin (de todas las temperaturas quitando los extremos)
 * • mostrar media de las temperaturas
 * • mostrar la media de las temperaturas sin la menor y mayor.
 * (TemperaturasArray)
 */

public class metodos_Ej5 {
    public static void main(String[] args) {
        double[] temperaturas = new double[10];
        rellenar(temperaturas);
        mostrar(temperaturas);
        System.out.println();
        System.out.println("La temperatura mayor es: " + temperaturaMayor(temperaturas));
        System.out.println();
        System.out.println("La temperatura menor es: " + temperaturaMenor(temperaturas));
        System.out.println();
        System.out.println("La media de las temperaturas es " + mediaTemperaturas(temperaturas));
        System.out.println("La media de las temperaturas sin los extremos es: " + mediaSin(temperaturas));
    }

    private static double mediaSin(double[] temperaturas) {
        double sumtotal = 0.0;
        double sumsin = 0.0;
        double media = 0.0;
        for (int i = 0; i < temperaturas.length; i++) {
            sumtotal += temperaturas[i];


        }
        sumsin = sumtotal - temperaturaMayor(temperaturas) - temperaturaMenor(temperaturas);
        double mediaRedondeada = sumsin / temperaturas.length-2;
         mediaRedondeada = Math.round(mediaRedondeada * 100.0) / 100.0;
        return mediaRedondeada;
    }

    private static double mediaTemperaturas(double[] temperaturas) {
        double media = 0.0;
        double totalSumatemperaturas = 0.0;
        for (int i = 0; i < temperaturas.length; i++) {
            totalSumatemperaturas += temperaturas[i];
        }
        double  mediaRedondeada = totalSumatemperaturas / temperaturas.length;
        mediaRedondeada = Math.round(mediaRedondeada * 100.0) / 100.0;
        return mediaRedondeada;
    }

    private static void mostrar(double[] temperaturas) {
        System.out.println(Arrays.toString(temperaturas));
    }

    public static double leerTemperaturaValidacion() {
        return leerDouble("Introduce la Temperatura: ", v -> v > -10 && v <= 50);
    }

    public static void rellenar(double[] datos) {
        for (int i = 0; i < datos.length; i++) {
            datos[i] = leerTemperaturaValidacion();

        }

    }

    public static double temperaturaMayor(double[] datos) {
        double temperaturaAlta = datos[0];
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] > temperaturaAlta) temperaturaAlta = datos[i];
        }
        return temperaturaAlta;
    }

    public static double temperaturaMenor(double[] datos) {
        double temperaturaMenor = datos[0];
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] < temperaturaMenor) temperaturaMenor = datos[i];
        }
        return temperaturaMenor;
    }

}








