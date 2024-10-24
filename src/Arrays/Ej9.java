package Arrays;

public class Ej9 {
    public static int positivos(int[] numeros) {
        int positivos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos ++;
            }
        }
        return positivos;
    }

    public static int negativos(int[] numeros) {
        int negativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                negativos ++;
            }
        }
        return negativos;
    }
    public static void main(String[] args) {
        int[] numeros = {1,4,5,-4,-4,-5};

        System.out.println("Tus positivos son: " + positivos(numeros) + " numeros");
        System.out.println("Tus negativos son: " + negativos(numeros) + " numeros");
    }
}

