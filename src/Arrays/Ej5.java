package Arrays;

public class Ej5 {
    public static int maximo(int[] numeros){
        int max = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numeros = {1,4,5,23,42,23,52,23,89,123,1,23};

        System.out.println(maximo(numeros));


    }
}
