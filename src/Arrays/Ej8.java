package Arrays;

public class Ej8 {
    public static int positivos(int[] numeros) {
        int positivos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos+=numeros[i];
            }
        }
        return positivos;
    }

    public static int negativos(int[] numeros) {
        int negativos = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                negativos+=numeros[i];
            }
        }
        return negativos;
    }
    public static void main(String[] args) {
        int[] numeros = {1,4,5,-4,-4,-5};

        System.out.println("Tus positivos suman: " + positivos(numeros));
        System.out.println("Tus negativos suman: " + negativos(numeros));
    }
}

