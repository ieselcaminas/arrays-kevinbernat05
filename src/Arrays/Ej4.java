package Arrays;

public class Ej4 {
    public static double mediaArray(double array) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        double suma = 0;
            for (int i = 0; i < numeros.length; i++) {
                suma += numeros[i];
            }
            double media = suma / numeros.length;
            return media;
    }
    public static void main(String[] args) {

        System.out.println(mediaArray(1));
    }
}
