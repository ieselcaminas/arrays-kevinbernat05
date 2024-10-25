package Arrays;

public class Ej9 {
    public static int pares(int[] numeros) {
        int pares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }
        return pares;
    }

    public static int impares(int[] numeros) {
        int impares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                impares++;
            }
        }
        return impares;
    }
    public static void main(String[] args) {
    int[] numeros = {1,4,5,-4,-4,-5};

        System.out.println("Tus pares son: " + pares(numeros));
        System.out.println("Tus impares son: " + impares(numeros));
    }
}

