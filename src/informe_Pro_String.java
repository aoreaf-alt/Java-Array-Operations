import lib.in;

public class informe_Pro_String {
    public static void main(String[] args) {
        // Validación de entrada con expresión regular [cite: 2218, 2219]
        // [A-Z0-9]{7} asegura 7 caracteres de letras mayúsculas o dígitos
        String siglas = in.leerString("Escribe una palabra con 7 letras o digitos: ", v -> v.matches("[A-Z0-9]{7}") && !v.contains("Ñ"));

        // a) Comprobar si es una matrícula (4 dígitos y 3 letras)
        // Usamos una expresión regular específica para este formato
        if (siglas.matches("[0-9]{4}[A-Z]{3}")) {
            System.out.println("Es una matricula");
        } else {
            System.out.println("No es una matricula");
        }
// b) Contabilizar el número de unos
        int numUnos = 0;
        for (int i = 0; i < siglas.length(); i++) {

            if (siglas.charAt(i) == '1') numUnos++;

        }
        System.out.println("El numero de unos es: " + numUnos);

// c) Contabilizar pares de letras consecutivas (Siguiendo la nota del examen)
        int paresconsecutivos = 0;
        for (int i = 0; i < siglas.length() - 1; i++) {
            char c = siglas.charAt(i);
            // Comprobamos si el carácter es letra y no un número
            if (Character.isLetter(c)) {
                // Fabricamos el "par ideal" sumando 1 en la tabla ASCII
                String par = "" + c + (char) (c + 1); //Esto me lo ha dado el profesor

// Si el recorte de 2 letras coincide con nuestro par ideal...
                if (siglas.substring(i, i + 2).equals(par)) {
                    paresconsecutivos++;


                }
            }
        }
    }
}