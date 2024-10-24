package Arrays;

public class Ej3 {
    public static String letraDNI(int dni) {
        String[] letras;

        letras = new String[23];

        // initialize first element
        letras[0] = "T";
        letras[1] = "R";
        letras[2] = "W";
        letras[3] = "A";
        letras[4] = "G";
        letras[5] = "M";
        letras[6] = "Y";
        letras[7] = "F";
        letras[8] = "P";
        letras[9] = "D";
        letras[10] = "X";
        letras[11] = "B";
        letras[12] = "N";
        letras[13] = "J";
        letras[14] = "Z";
        letras[15] = "S";
        letras[16] = "Q";
        letras[17] = "V";
        letras[18] = "H";
        letras[19] = "L";
        letras[20] = "C";
        letras[21] = "K";
        letras[22] = "E";

        int res = dni % 23;// initialize second element

        return letras[res];
    }

    public static void main(String[] args) {

        int dni = Utilidades.leerEntero("Introduce tu dni: ");

        System.out.println(letraDNI(dni));
    }
}


